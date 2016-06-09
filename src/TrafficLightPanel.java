import javax.swing.*;
import java.awt.*;

public class TrafficLightPanel extends JPanel
{
    private int currentState = 0;
    private final int NUM_LIGHTS = 3;
    private final int X = 50, Y = 10, WIDTH = 50, HEIGHT = 130;
    private final int DIAMETER = 30;
    private final int X_OFFSET = 10, Y_OFFSET = 10;
    private final int PANEL_WIDTH = 150, PANEL_HEIGHT = 230;
    
    public void TrafficLightPanel()
    {
        setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
    }
    
    @Override
    public void paintComponent(Graphics page)
    {
        super.paintComponent(page);
        int lightOn = currentState % NUM_LIGHTS;
        setBackground(Color.white);
        page.setColor(Color.lightGray);
        page.fillRect(X, Y, WIDTH, HEIGHT);
        
        switch (lightOn)
        {
            case 0:
                page.setColor(Color.red);
                page.fillOval((X + X_OFFSET), (Y + Y_OFFSET), DIAMETER, DIAMETER);
                page.setColor(Color.darkGray);
                page.fillOval((X + X_OFFSET), 60, DIAMETER, DIAMETER);
                page.setColor(Color.darkGray);
                page.fillOval((X + X_OFFSET), 100, DIAMETER, DIAMETER);
                break;
                
            case 1:
                page.setColor(Color.darkGray);
                page.fillOval((X + X_OFFSET), (Y + Y_OFFSET), DIAMETER, DIAMETER);
                page.setColor(Color.darkGray);
                page.fillOval((X + X_OFFSET), 60, DIAMETER, DIAMETER);
                page.setColor(Color.green);
                page.fillOval((X + X_OFFSET), 100, DIAMETER, DIAMETER);
                break;
                
            case 2:
                page.setColor(Color.darkGray);
                page.fillOval((X + X_OFFSET), (Y + Y_OFFSET), DIAMETER, DIAMETER);
                page.setColor(Color.yellow);
                page.fillOval((X + X_OFFSET), 60, DIAMETER, DIAMETER);
                page.setColor(Color.darkGray);
                page.fillOval((X + X_OFFSET), 100, DIAMETER, DIAMETER);
                break;                
        }
    }
    
    public void change()
    {
        currentState++;
        repaint();
    }
}
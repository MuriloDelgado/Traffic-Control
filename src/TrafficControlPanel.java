import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TrafficControlPanel extends JPanel
{
    private JButton changeLight;
    private TrafficLightPanel light;
    
    public TrafficControlPanel()
    {
        setLayout(new BorderLayout());
        light = new TrafficLightPanel();       
        changeLight = new JButton("Change Light");
        changeLight.addActionListener(new TrafficControlPanel.ChangeListener());
        setBackground(Color.white);
        add(light, BorderLayout.CENTER);
        add(changeLight, BorderLayout.SOUTH);
    }
    
    private class ChangeListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent event)
        {
            light.change();
        }
    }
    
}
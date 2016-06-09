import javax.swing.JFrame;

public class TrafficLight
{
    public static void main(String[] args)
    {
        JFrame light = new JFrame("Traffic Light");
        light.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        light.getContentPane().add(new TrafficControlPanel());
        light.pack();
        light.setVisible(true);
    }
}

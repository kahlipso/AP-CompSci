import javax.swing.*;
import java.awt.*;
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public int width = 300;
    public int height = 300;
    
    public static void main(String[] args)
    {
        new Main();
        
    }
    
    public Main()
    {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
            JFrame frame = new JFrame("Frame");
            KeyListener key = new KeyListener();
        
            frame.setSize(width, height);
            frame.add(new Panel());
            frame.addKeyListener(key);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            }
        });
        
        
    }
    
}

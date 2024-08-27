import javax.swing.JPanel;
import java.awt.*;
/**
 * Write a description of class Panel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Panel extends JPanel
{
    public int x = 50;
    
    public Panel()
    {
        setBackground(Color.WHITE);
    }
    
    public Dimension getPreferredSize()
    {
        return new Dimension(300, 300);
    }
    
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setPaint(Color.BLACK);
        g2d.fillRect(50, 50, x, 50);
        g2d.dispose();
    }
}

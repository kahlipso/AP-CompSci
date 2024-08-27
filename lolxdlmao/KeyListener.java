import java.awt.*;
import java.awt.event.*;
/**
 * Write a description of class KeyListener here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class KeyListener
{
    public void keyReleased(KeyEvent e)
    {
        int keyCode = e.getKeyCode();
        System.out.println(KeyEvent.getKeyText(keyCode));
    }
    
}

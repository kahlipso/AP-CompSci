import javax.swing.*;
import java.util.*;

public class Main {

    public int width = 500;
    public int height = 500;

    public static void main(String[] args) {

        new Main();
    }

    public Main()
    {
        JFrame frame = new JFrame("title");
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}
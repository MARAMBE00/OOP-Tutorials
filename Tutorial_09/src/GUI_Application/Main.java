package GUI_Application;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args)  {
        JFrame counter = new Counter();
        counter.setBackground(Color.yellow);
        counter.setSize(600, 100);
        counter.setTitle("My Counter");
        counter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        counter.setVisible(true);
    }
}

package Calculator_Application;

import javax.swing.*;
import java.awt.*;

public class CalculatorFrame extends JFrame {

    public CalculatorFrame() {
        setTitle("My Calculator");

        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4, 3, 10, 10));
        p1.setBackground(Color.blue);

        for (int i = 1; i <= 9; i++) {
            JButton button = new JButton(Integer.toString(i));
            button.setBackground(Color.RED);
            button.setOpaque(true);
            button.setBorderPainted(false);
            button.setForeground(Color.blue);
            button.setFont(new Font("Arial", Font.BOLD, 20));
            p1.add(button);
        }

        JButton zeroButton = new JButton("0");
        zeroButton.setFont(new Font("Arial", Font.BOLD, 20));
        zeroButton.setBackground(Color.RED);
        zeroButton.setOpaque(true);
        zeroButton.setBorderPainted(false);
        zeroButton.setForeground(Color.blue);
        p1.add(zeroButton);

        JButton dotButton = new JButton(".");
        dotButton.setFont(new Font("Arial", Font.BOLD, 20));
        dotButton.setBackground(Color.RED);
        dotButton.setOpaque(true);
        dotButton.setBorderPainted(false);
        dotButton.setForeground(Color.blue);
        p1.add(dotButton);

        JPanel p2 = new JPanel();
        p2.setBackground(Color.blue);
        p2.setLayout(new GridLayout(4, 1, 2, 2));

        JButton plusButton = new JButton("+");
        plusButton.setFont(new Font("Arial", Font.BOLD, 20));
        plusButton.setBackground(Color.green);
        plusButton.setOpaque(true);
        plusButton.setBorderPainted(false);
        plusButton.setForeground(Color.blue);
        p2.add(plusButton);

        JButton minusButton = new JButton("-");
        minusButton.setFont(new Font("Arial", Font.BOLD, 20));
        minusButton.setBackground(Color.green);
        minusButton.setOpaque(true);
        minusButton.setBorderPainted(false);
        minusButton.setForeground(Color.blue);
        p2.add(minusButton);

        JButton clearButton = new JButton("Clear");
        clearButton.setFont(new Font("Arial", Font.BOLD, 20));
        clearButton.setBackground(Color.green);
        clearButton.setOpaque(true);
        clearButton.setBorderPainted(false);
        clearButton.setForeground(Color.blue);
        p2.add(clearButton);

        JPanel p3 = new JPanel();
        p3.setLayout(new GridLayout(1, 2));
        p3.add(p1);
        p3.add(p2);

        JTextField txtField = new JTextField();
        txtField.setFont(new Font("Arial", Font.BOLD, 20));
        txtField.setBackground(Color.yellow);
        txtField.setForeground(Color.blue);
        this.add(p3, BorderLayout.CENTER);
        this.add(txtField, BorderLayout.NORTH);
    }
}



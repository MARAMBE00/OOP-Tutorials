package GUI_Application;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Counter extends JFrame{
    private JLabel lblCount;
    private JTextField tfCount;
    private JButton btnCount;
    private JButton btnCountDown;
    private JButton btnReset;
    private int count = 0;

    public Counter () {
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());

        lblCount = new JLabel("Counter");
        cp.add(lblCount);

        tfCount = new JTextField(count + "", 10);
        tfCount.setEditable(false);
        cp.add(tfCount);

        btnCount = new JButton("Count Up");
        cp.add(btnCount);

        btnCountDown = new JButton("Count down");
        cp.add(btnCountDown);

        btnReset = new JButton("Reset");
        cp.add(btnReset);

        MyListener handler = new MyListener();
        btnCount.addActionListener(handler);
        btnCountDown.addActionListener(handler);
        btnReset.addActionListener(handler);

    }

    private class MyListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt) {
            String btnLabel = evt.getActionCommand();
            if (btnLabel.equals("Count Up")) {
                ++count;
                tfCount.setText(count + "");
            } else if (btnLabel.equals("Count down")) {
                --count;
                tfCount.setText(count + "");
            } else if (btnLabel.equals("Reset")){
                count = 0;
                tfCount.setText(count + "");
            }
        }
    }
}


package Calculator_Application;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        CalculatorFrame myCalculator = new CalculatorFrame();
        myCalculator.setVisible(true);
        myCalculator.setSize(600, 300);
        myCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

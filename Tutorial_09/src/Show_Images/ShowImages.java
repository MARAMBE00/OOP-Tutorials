package Show_Images;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ShowImages extends JFrame{
    JButton btnOne;
    JButton btnTwo;
    JLabel lblImage;
    ImageIcon imageIconZero;
    ImageIcon imageIconOne;
    ImageIcon imageIconTwo;

    public ShowImages(){

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        cp.setBackground(Color.blue);

        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(1,2));
        btnOne = new JButton("One");
        p1.add(btnOne);

        btnTwo = new JButton("Two");
        p1.add(btnTwo);

        try{
            imageIconZero = new ImageIcon(getClass().getResource("zero.png"));
        }catch (NullPointerException e){
            System.out.println("Image zero not found");
        }
        lblImage = new JLabel(imageIconZero, JLabel.CENTER);

        cp.add(lblImage, BorderLayout.CENTER);
        cp.add(p1, BorderLayout.SOUTH);

        try{
            imageIconOne = new ImageIcon(getClass().getResource("one.png"));
        }catch(NullPointerException e){
            System.out.println("Image one not found");
        }

        try{
            imageIconTwo = new ImageIcon(getClass().getResource("two.png"));
        }catch(NullPointerException e){
            System.out.println("Image two not found");
        }

        MyListener myListener = new MyListener();
        btnOne.addActionListener(myListener);
        btnTwo.addActionListener(myListener);
        lblImage.addMouseListener(myListener);
    }

    private class MyListener extends MouseAdapter  implements ActionListener{
        public void actionPerformed(ActionEvent evt) {
            String btnLabel = evt.getActionCommand();
            if (btnLabel.equals("One")) {
                lblImage.setIcon(imageIconOne);
            } else if (btnLabel.equals("Two")) {
                lblImage.setIcon(imageIconTwo);
            }
        }
        public void mouseClicked(MouseEvent evt){
            lblImage.setIcon(imageIconZero);
        }
    }
}

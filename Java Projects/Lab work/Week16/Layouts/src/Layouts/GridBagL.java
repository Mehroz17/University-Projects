package Layouts;

import javax.swing.*;
import java.awt.*;

public class GridBagL {
    public static void main(String[] args) {
        //Grid Bag Layout
        /*
        in this we can specify the location of all the objects
         */

        JFrame jf = new JFrame("Flow Layout");
        jf.setVisible(true);
        jf.setSize(400,400);
        GridBagConstraints gc = new GridBagConstraints();


        JButton b = new JButton("Login1");
        gc.gridx = 0;
        gc.gridy = 0;
        jf.add(b,gc);

        JButton b2 = new JButton("Login2");
        gc.gridx = 1;
        gc.gridy = 0;
        jf.add(b2,gc);

        JButton b3= new JButton("Login3");
        gc.gridx = 2;
        gc.gridy = 1;
        jf.add(b3,gc);
        JButton b4 = new JButton("Login4");
        gc.gridx = 3;
        gc.gridy = 0;
        jf.add(b4,gc);



        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);



    }
}

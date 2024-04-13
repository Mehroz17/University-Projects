package Layouts;

import javax.swing.*;
import java.awt.*;

public class GL {

    //Grid layout
    /*
    it will specifies the data in coulmns and rows
    we can specifies the number of rows and coulmns
     */
    public static void main(String[] args) {
        JFrame jf = new JFrame("Grid Layout");
        jf.setVisible(true);
        jf.setSize(100,100);
        jf.setLayout(new GridLayout(2,2,1,1)); // we have arrange the buttons in 3 rows and 3 columns
//we can add gap between buttons horizontaly and vertically


        JButton b = new JButton("Login");
        JButton b2 = new JButton("Login");
        JButton b3= new JButton("Login");
        JButton b4 = new JButton("Login");
        JButton b8 = new JButton("Login");
        JButton b5 = new JButton("Login");
        JButton b6 = new JButton("Login");
        JButton b7 = new JButton("Login");
        JButton b9 = new JButton("Login");
        jf.add(b);
        jf.add(b2);
        jf.add(b3);
        jf.add(b4);
        jf.add(b5);
        jf.add(b6);
        jf.add(b7);
        jf.add(b8);
        jf.add(b9);

        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);



    }
}

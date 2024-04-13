package Layouts;

import javax.swing.*;
import java.awt.*;

//Flow Layout
public class FlowLayout {

    public static void main(String[] args) {
        JFrame jf = new JFrame("Flow Layout");
        jf.setVisible(true);
        jf.setSize(400,400);
        jf.setLayout( new java.awt.FlowLayout());

        JPanel jp1 = new JPanel();
        jp1.setBackground(Color.black);
        jp1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));


        JButton b = new JButton("Login");
        JButton b2 = new JButton("Login");
        JButton b3= new JButton("Login");
        JButton b4 = new JButton("Login");
        JButton b8 = new JButton("Login");
        JButton b5 = new JButton("Login");
        JButton b6 = new JButton("Login");
        JButton b7 = new JButton("Login");
        jf.add(b);
        jf.add(b2);
        jf.add(b3);
        jf.add(b4);
        jf.add(b5);
        jf.add(b6);
        jf.add(b7);
        jf.add(b8);
        jf.add(jp1);
        //in flow layout the first component will be in center and next will be along the left side and when the line will be complete the the next will be in the next line
// flow layout means that the components will be flow in according to the size of container







        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
         }
}

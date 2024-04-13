package Layouts;

//Thusday Tipic will be "JTables"

//Optional  Java and JDBC(Full on friday) how to connect java and database,CURD


import javax.swing.*;
import java.awt.*;

public class BorderL {
    public static void main(String[] args) {

        //Topic Layout
        /*
        1 Border layout
        2. FLowLayout
        3. Grid Layout
        4. Grid BagLayout //Lab exam will be on 18
         */
//Layout
/*
layout is an object that helps you arrange the compnonents on the container in different ways.
 */

        JFrame jf = new JFrame("Boder Layout");
        jf.setVisible(true);
        jf.setSize(400,400);


        //Boder Layout:-
        /*
        it is used when you need to arrange the components on a container at the border
        the container is diveded in North, South East and West border.
        it is more usefull in the case of JPanel

        Remember in Border Layout
        sometime height flexible
         */

        jf.setLayout(new BorderLayout()); //Border Layout is a class present in AWT package
        //so to add compnonets in border layout we can use methods of border layout

        JPanel jp1 = new JPanel();
        jp1.setBackground(Color.RED);
        jp1.setPreferredSize(new Dimension (50,50)); //seting width and height by using Dimension class
        JPanel jp2 = new JPanel();
        jp2.setBackground(Color.CYAN);
        jp2.setPreferredSize(new Dimension (50,50));

        JPanel jp3 = new JPanel();
        jp3.setBackground(Color.GREEN);
        jp3.setPreferredSize(new Dimension (50,50));

        JPanel jp4 = new JPanel();
        jp4.setBackground(Color.MAGENTA);
        jp4.setPreferredSize(new Dimension (50,50));

        JPanel jp5= new JPanel();
        jp5.setLayout(new GridLayout(2,2));
        jp5.setBackground(Color.BLUE);


        JButton jb4 = new JButton("Noth Button");
        JButton jb3 = new JButton("Noth Button");
        JButton jb2 = new JButton("Noth Button");
        JButton jb1 = new JButton("Noth Button");

        jf.add(jp1,BorderLayout.NORTH);

        jf.add(jp2,BorderLayout.EAST);
        jf.add(jp3,BorderLayout.SOUTH);
        jf.add(jp4,BorderLayout.WEST);
        jf.add(jp5,BorderLayout.CENTER);
        jp5.add(jb1);
        jp5.add(jb2);
        jp5.add(jb3);
        jp5.add(jb4);



jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);



    }
}

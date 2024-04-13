package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Topic : GUI
public class Main extends JFrame {
    public static void main(String[ ] args){

/*
Since it includes a a main method , therefore , it can run independently
Java's Gui does not need internet as we have need internet for HTML and CSS
there are also some programes in java which uses internet for runing which are embded in Html

* There are 2 application program interface API(Application program interfaces are set of predefinie classes that do something for you)
    1. AWT            2.Swing


*** WE ara intereseted in Swing , beacuse it is latest,extended version of AWT classes and in use.
AWt is depreciated, we mean that most of support for its classes are no long availabel

Using JFrame
 */


        JFrame jf = new JFrame("Terminal Examination");
        //Using method of Jframe
        jf.setVisible(true);  // it is making a frame
        jf.setSize(800,800); //these values are in pixels


        //JFram is a caontainer class that serves as container for the components

        //Adding components

        //all the classes present in Swing package started from J (Quiz Question)
        // what is the difference between JFrame and Frame
        //JFrame is present in Swing package but Frame is peresent in

        //*JLable

        JLabel jl1 = new JLabel("Name:   ");
        JLabel jl2 = new JLabel("Father NAme:   ");
        JLabel jl3 = new JLabel("Email:   ");
        JLabel jl4 = new JLabel("Programe:   ");


        //Jtext feil
        JTextField jt1 = new JFormattedTextField();
        JTextField jt2 = new JFormattedTextField();
        JTextField jt3 = new JFormattedTextField();
        JTextField jt4 = new JFormattedTextField();


        jf.setLayout(null); // seting default values to null
        JPopupMenu fee = new JPopupMenu();

        //Addin the lable in the frame
        jf.add(jl1);
        jf.add(jl2);
        jf.add(jl3);
        jf.add(jl4);
        jf.add(jt1);
        jf.add(jt2);
        jf.add(jt3);
        jf.add(jt4);
        jf.add(fee);


        jl1.setBounds(50,50,100,20);// seting the dimesions of the labels
        jl2.setBounds(50,100,100,20);// seting the
        jl3.setBounds(50,150,100,20);// seting the
        jl4.setBounds(50,200,100,20);// seting the

        jt1.setBounds(150,50,300,40);// seting the dimesions of the Text feilds
        jt2.setBounds(150,100,300,40);
        jt3.setBounds(150,150,300,40);
        jt4.setBounds(150,200,300,40);


//Adding Button
        JButton jb1 = new JButton("New Student");

        JButton jb2 = new JButton("Present Student");

//Seting bounds fro buttins
        jb1.setBounds(150,250,100,40);

        jb2.setBounds(350,250,100,40);

// wehave to add buttons of to the frame JFrame
        jf.add(jb1);
        jf.add(jb2);


        JCheckBox jc = new JCheckBox("Stdent");
        jc.setBounds(450,300,100,30);
        jf.add(jc);




    }
}

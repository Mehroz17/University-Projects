package cal;

import cal.Calculator;

import javax.swing.*;

public class MAin2 {
    public static void main(String[] args){

        JFrame cal = new JFrame("Calculator");
        cal.setContentPane(new Calculator().getMainPanel());
        cal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cal.pack();
        cal.setVisible(true);



    }
}

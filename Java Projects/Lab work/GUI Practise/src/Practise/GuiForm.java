package Practise;

import javax.swing.*;
import java.awt.*;

public class GuiForm {
private JFrame jf1;
private JPanel jp1;
private JLabel jl1;
private JButton b1;

    public GuiForm() {
        init();
    }

    private void init(){
        //Container
        jf1 = new JFrame("Practise");
        jf1.setLayout(null);
        jf1.setSize(500,500);

        //Jpanel
        jp1 = new JPanel();
        jp1.setLayout(new FlowLayout());
        jp1.setSize(500,250);
        jp1.setBackground(Color.yellow);


        //Label
        jl1 = new JLabel();
        jl1.setText("First Label");
        jl1.setBounds(50,70,20,30);
        jl1.setBackground(Color.cyan);

        //JButton

        b1 = new JButton();
        b1.setText("Button1");
        b1.setBounds(70,70,20,30);
        b1.setBackground(Color.cyan);


        //Adding Components to Jpanel
        jp1.add(jl1);
        jp1.add(b1);


        //Adding Components to Jframe
        jf1.add(jp1);


        //Making Visible
        jf1.setVisible(true);

        //Quit
        jf1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

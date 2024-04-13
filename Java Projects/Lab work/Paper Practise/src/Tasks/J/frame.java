package Tasks.J;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frame {

    private JFrame jf;
    private JLabel l1;
    private JLabel l2;
    private JTextField t1;
    private JTextField t2;
    private JTextField screen;
    private JButton b1;
    private JButton b2;

    public void init(){

        jf = new JFrame("Suming to Number");
        jf.setLayout(null);
        jf.setSize(200,200);
        jf.setVisible(true);


        l1 = new JLabel();
        l1.setText("Number 1");
        l1.setBounds(40,60,100,20);

        l2 = new JLabel();
        l2.setText("Number 2");
        l2.setBounds(50,80,100,20);

        t1 = new JTextField();
        t1.setBounds(80,60,100,20);
        t2= new JTextField();
        t2.setBounds(80,80,100,20);

        screen = new JTextField();
        screen.setEditable(false);
        screen.setBounds(150,150,100,20);


        b1 = new JButton();
        b1.setText("Add");
        b1.setBounds(200,100,100,20);

        b2 = new JButton();
        b1.setText("Clear");
        b2.setBounds(200,150,100,20);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                   int n1 =  Integer. parseInt(t1.getText());
                   int n2 = Integer.parseInt(t2.getText());
                   int sum = n1+n2;
                   screen.setText(String.valueOf(sum));
                }catch (NumberFormatException m){
                    System.out.println("Enter Number");
                }
            }
        });


        //adding
        jf.add(l1);
        jf.add(l2);
        jf.add(t1);
        jf.add(t2);
        jf.add(screen);
        jf.add(b1);
        jf.add(b2);





        //closing
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
    }

}

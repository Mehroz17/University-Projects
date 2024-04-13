package Cal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calGui {
    private JFrame frame;
    private JTextField add;
    private JTextField sub;
    private JTextField dis;

    public calGui() {
        init();
    }
    public void init(){
        frame = new JFrame();
        frame.setBounds(100,100,700,400);
        frame.setVisible(true);
        frame.setLayout(null);



        add = new JTextField();
        add.setFont(new Font("Tahoma", Font.BOLD,25));
        add.setBounds(72,41,153,64);
        frame.add(add);
        add.setColumns(10);

        sub = new JTextField();
        sub.setFont(new Font("Tahoma", Font.BOLD,25));
        sub.setBounds(72,41,153,64);
        frame.add(sub);
        sub.setColumns(10);

        JButton bnadd = new JButton("ADD");
        bnadd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1,num2,ans;
                try {
                    num1 = Integer.parseInt(add.getText());
                    num2 = Integer.parseInt(add.getText());
                    ans = num1+num2;
                    dis.setText(Integer.toString(ans));
                }
                catch (Exception p){}
                JOptionPane.showMessageDialog(null,"ONLY Integers");
            }
        });

        bnadd.setFont(new Font("Tahoma",Font .BOLD,15));
        bnadd.setBounds(223,171,108,51);
        frame.add(bnadd);


        JButton bnsub = new JButton("ADD");
        bnadd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1,num2,ans;
                try {
                    num1 = Integer.parseInt(add.getText());
                    num2 = Integer.parseInt(add.getText());
                ans = num1 - num2;
                dis.setText(Integer.toString(ans));
                }
                catch (Exception p){}
                JOptionPane.showMessageDialog(null,"ONLY Integers");
            }
        });

        bnsub.setFont(new Font("Tahoma",Font .BOLD,15));
        bnsub.setBounds(223,171,108,51);
        frame.add(bnsub);


        dis = new JTextField();
        dis.setFont(new Font("Tahoma",Font.BOLD,25));
        dis.setBounds(136,251,401,64);
        frame.add(dis);
        dis.setColumns(10);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }





}//End Class
//package G;
//
//import java.awt.EventQueue;
//
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import java.awt.BorderLayout;
//import javax.swing.JTextField;
//import java.awt.Color;
//import java.awt.Font;
//import javax.swing.SwingConstants;
//import javax.swing.JButton;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;
//import java.awt.event.KeyAdapter;
//import java.awt.event.KeyEvent;
//
//public class Calculator  {
//
//    private JFrame bFrame;
//    private JTextField Screen;
//    String s0, s1, s2;
//
//
//    public void init() {
//
//        bFrame = new JFrame();
//
//        JPanel Screenandbuttons = new JPanel();
//        bFrame.getContentPane().add(Screenandbuttons, BorderLayout.CENTER);
//        Screenandbuttons.setLayout(null);
//
//        Screen = new JTextField();
//        Screen.setHorizontalAlignment(SwingConstants.LEFT);
//        Screen.setForeground(Color.WHITE);
//        Screen.setFont(new Font("Times New Roman", Font.PLAIN, 16));
//        Screen.setEditable(false);
//        Screen.setBackground(Color.DARK_GRAY);
//        Screen.setBounds(10, 10, 589, 60);
//        Screenandbuttons.add(Screen);
//        Screen.setColumns(10);
//
//        JButton B1 = new JButton("1");
//        B1.setFont(new Font("Tahoma", Font.PLAIN, 16));
//        B1.setForeground(Color.RED);
//        B1.setBackground(Color.LIGHT_GRAY);
//        B1.setBounds(10, 149, 101, 33);
//        Screenandbuttons.add(B1);
//
//
//        JButton B2 = new JButton("2");
//        B2.setForeground(Color.RED);
//        B2.setFont(new Font("Tahoma", Font.PLAIN, 16));
//        B2.setBackground(Color.LIGHT_GRAY);
//        B2.setBounds(176, 149, 101, 33);
//        Screenandbuttons.add(B2);
//
//
//        JButton B3 = new JButton("3");
//        B3.setForeground(Color.RED);
//        B3.setFont(new Font("Tahoma", Font.PLAIN, 16));
//        B3.setBackground(Color.LIGHT_GRAY);
//        B3.setBounds(335, 149, 101, 33);
//        Screenandbuttons.add(B3);
//
//
//        JButton B4 = new JButton("4");
//        B4.setForeground(Color.RED);
//        B4.setFont(new Font("Tahoma", Font.PLAIN, 16));
//        B4.setBackground(Color.LIGHT_GRAY);
//        B4.setBounds(488, 149, 101, 33);
//        Screenandbuttons.add(B4);
//
//
//        JButton B5 = new JButton("5");
//        B5.setForeground(Color.RED);
//        B5.setFont(new Font("Tahoma", Font.PLAIN, 16));
//        B5.setBackground(Color.LIGHT_GRAY);
//        B5.setBounds(10, 214, 101, 33);
//        Screenandbuttons.add(B5);
//
//
//        JButton B6 = new JButton("6");
//        B6.setForeground(Color.RED);
//        B6.setFont(new Font("Tahoma", Font.PLAIN, 16));
//        B6.setBackground(Color.LIGHT_GRAY);
//        B6.setBounds(176, 214, 101, 33);
//        Screenandbuttons.add(B6);
//
//
//        JButton B7 = new JButton("7");
//        B7.setForeground(Color.RED);
//        B7.setFont(new Font("Tahoma", Font.PLAIN, 16));
//        B7.setBackground(Color.LIGHT_GRAY);
//        B7.setBounds(335, 214, 101, 33);
//        Screenandbuttons.add(B7);
//
//
//        JButton B8 = new JButton("8");
//        B8.setForeground(Color.RED);
//        B8.setFont(new Font("Tahoma", Font.PLAIN, 16));
//        B8.setBackground(Color.LIGHT_GRAY);
//        B8.setBounds(488, 214, 101, 33);
//        Screenandbuttons.add(B8);
//
//
//        JButton B9 = new JButton("9");
//        B9.setForeground(Color.RED);
//        B9.setFont(new Font("Tahoma", Font.PLAIN, 16));
//        B9.setBackground(Color.LIGHT_GRAY);
//        B9.setBounds(176, 277, 101, 33);
//        Screenandbuttons.add(B9);
//
//        JButton B10 = new JButton("0");
//        B10.setForeground(Color.RED);
//        B10.setFont(new Font("Tahoma", Font.PLAIN, 16));
//        B10.setBackground(Color.LIGHT_GRAY);
//        B10.setBounds(335, 277, 101, 33);
//        Screenandbuttons.add(B10);
//
//
//        JButton AddButton = new JButton("+");
//        AddButton.setFont(new Font("Times New Roman", Font.PLAIN, 37));
//        AddButton.setBounds(90, 393, 123, 39);
//        Screenandbuttons.add(AddButton);
//
//        JButton subtract = new JButton("-");
//        subtract.setFont(new Font("Times New Roman", Font.PLAIN, 49));
//        subtract.setBounds(246, 393, 123, 39);
//        Screenandbuttons.add(subtract);
//
//        JButton btnClear = new JButton("Clear");
//        btnClear.setFont(new Font("Times New Roman", Font.PLAIN, 17));
//        btnClear.setBounds(391, 393, 123, 39);
//        Screenandbuttons.add(btnClear);
//
//        JButton equals = new JButton("Clear");
//        equals.setFont(new Font("Times New Roman", Font.PLAIN, 17));
//        equals.setBounds(491, 393, 123, 39);
//        Screenandbuttons.add(equals);
//
//        //Action of Buttons
//      B1.addActionListener(new ActionListener() {
//          @Override
//          public void actionPerformed(ActionEvent e) {
//              String b1t = Screen.getText()+B1.getText();
//              Screen.setText(b1t);
//          }
//      });
//
//      B2.addActionListener(new ActionListener() {
//          @Override
//          public void actionPerformed(ActionEvent e) {
//              String b2t = Screen.getText()+B2.getText();
//              Screen.setText(b2t);
//          }
//      });
//
//        B3.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String b3t = Screen.getText()+B2.getText();
//                Screen.setText(b3t);
//            }
//        });
//
//        B4.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String b4t = Screen.getText()+B2.getText();
//                Screen.setText(b4t);
//            }
//        });
//        B5.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String b4t = Screen.getText()+B2.getText();
//                Screen.setText(b4t);
//            }
//        });
//
//        B6.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String b4t = Screen.getText()+B2.getText();
//                Screen.setText(b4t);
//            }
//        });
//
//        B7.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String b4t = Screen.getText()+B2.getText();
//                Screen.setText(b4t);
//            }
//        });
//
//        B8.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String b4t = Screen.getText()+B2.getText();
//                Screen.setText(b4t);
//            }
//        });
//        B9.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String b4t = Screen.getText()+B2.getText();
//                Screen.setText(b4t);
//            }
//        });
//        B10.addActionListener(c);
//        AddButton.addActionListener(c);
//        subtract.addActionListener(c);
//        equals.addActionListener(c);
//        bFrame.setVisible(true);
//        bFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//    }
//
//
//
//}
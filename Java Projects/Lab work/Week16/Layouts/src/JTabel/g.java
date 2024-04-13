package JTabel;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import java.awt.Cursor;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.event.*;
import java.util.InputMismatchException;

public class g {

    private JFrame frame;
    private JTextField tf1;
    private JPasswordField pwdPassword;



    public void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 652, 621);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);

        JPanel wp = new JPanel();
        wp.setBounds(0, 0, 638, 86);
        wp.setPreferredSize(new Dimension(30, 30));
        wp.setBackground(Color.ORANGE);
        frame.getContentPane().add(wp);
        wp.setLayout(null);

        JLabel well = new JLabel("Welcome ");
        well.setBorder(null);
        well.setFont(new Font("Source Serif Pro ExtraLight", Font.PLAIN, 43));
        well.setBounds(245, 10, 239, 66);
        wp.add(well);

        JPanel cp = new JPanel();
        cp.setBorder(new LineBorder(SystemColor.textHighlight, 1, true));
        cp.setBounds(99, 116, 438, 400);
        frame.getContentPane().add(cp);
        cp.setLayout(new BorderLayout(0, 0));

        JPanel panel = new JPanel();
        panel.setBackground(SystemColor.activeCaption);
        cp.add(panel, BorderLayout.NORTH);

        JLabel logl = new JLabel("Login");
        logl.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 26));
        panel.add(logl);

        JPanel panel_1 = new JPanel();
        cp.add(panel_1, BorderLayout.CENTER);
        panel_1.setLayout(null);

        tf1 = new JTextField();
        tf1.setToolTipText("User Name");
        tf1.setHorizontalAlignment(SwingConstants.CENTER);
        tf1.setFont(new Font("Source Serif Pro Light", Font.PLAIN, 14));
        tf1.setBounds(104, 75, 227, 27);
        panel_1.add(tf1);
        tf1.setColumns(10);

        pwdPassword = new JPasswordField();
        pwdPassword.setToolTipText("Password");
        pwdPassword.setHorizontalAlignment(SwingConstants.CENTER);
        pwdPassword.setBounds(104, 148, 227, 27);
        panel_1.add(pwdPassword);

        JButton btnNewButton = new JButton("Login");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(tf1.getText().length() == 0 && pwdPassword.getPassword().length ==0 ) {
                    JOptionPane.showMessageDialog(null, "Enter Name");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Logined");
                }

            }
        });
        btnNewButton.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(0, 0, 128), new Color(0, 255, 255), null, null));
        btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnNewButton.setBackground(SystemColor.activeCaption);
        btnNewButton.setForeground(SystemColor.textHighlight);
        btnNewButton.setFont(new Font("Source Sans Pro Light", Font.PLAIN, 18));
        btnNewButton.setBounds(144, 253, 141, 37);
        panel_1.add(btnNewButton);




    }

}

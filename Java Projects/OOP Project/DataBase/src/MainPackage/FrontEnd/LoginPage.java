package MainPackage.FrontEnd;


import MainPackage.BackendLogic.Insert;
import MainPackage.BackendLogic.LoginandDispaly;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.event.*;
import java.util.Arrays;
import java.util.InputMismatchException;


public class LoginPage {

    private JFrame frame;
    private JTextField usertext;
    private JPasswordField pwdF;
    private JPanel panel;
    private JTextField idT;
    private JTextField frstT;
    private JTextField lastT;
    private JTextField userT;
    private JTextField passT;
    private JTextField ageT;
    private JTextField semT;
    private JCheckBox checkBox;
    private JPanel accountpanel;
    private JLabel warning;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {

                    LoginPage window = new LoginPage();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public LoginPage() {
        initialize();
    }


    //Making a global object of the class


    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(34, 139, 34));
        frame.setBounds(100, 100, 860, 639);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);


        JLabel mainheading = new JLabel("Student Portal");
        mainheading.setForeground(new Color(255, 255, 0));
        mainheading.setFont(new Font("Times New Roman", Font.PLAIN, 55));
        mainheading.setBounds(250, 10, 334, 45);
        frame.getContentPane().add(mainheading);

        panel = new JPanel();
        panel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 128, 0)));
        panel.setBackground(new Color(50, 205, 50));
        panel.setBounds(224, 65, 384, 336);
        frame.getContentPane().add(panel);
        panel.setLayout(null);

        usertext = new JTextField();
        usertext.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if(usertext.getText().equals("User Name")) {
                    usertext.setText("");
                }else {
                    usertext.selectAll();
                }
            }
        });
        usertext.setHorizontalAlignment(SwingConstants.CENTER);
        usertext.setForeground(new Color(0, 0, 255));
        usertext.setBorder(new LineBorder(new Color(245, 255, 250), 5, true));
        usertext.setText("User Name");
        usertext.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 23));
        usertext.setBounds(37, 97, 313, 38);
        panel.add(usertext);
        usertext.setColumns(10);

        pwdF = new JPasswordField();
        pwdF.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if(pwdF.getText().equals("Password")) {
                    pwdF.setText("");
                    pwdF.setEchoChar('.');
                }
                else {
                    pwdF.selectAll();
                }

            }
        });
        pwdF.setForeground(Color.BLUE);
        pwdF.setBorder(new LineBorder(new Color(245, 245, 245), 5, true));
        pwdF.setHorizontalAlignment(SwingConstants.CENTER);
        pwdF.setFont(new Font("Yu Gothic Light", Font.PLAIN, 23));
        pwdF.setText("Password");
        pwdF.setEchoChar((char)0);
        pwdF.setBounds(37, 169, 313, 38);
        panel.add(pwdF);

        //-------------------Login Button---------------
        JButton loginbtn = new JButton("Login");
        loginbtn.setVerticalAlignment(SwingConstants.TOP);
        loginbtn.setForeground(new Color(0, 0, 205));
        loginbtn.setBackground(Color.WHITE);
        loginbtn.setBorder(new LineBorder(new Color(240, 255, 255), 5, true));
        loginbtn.setHorizontalTextPosition(SwingConstants.CENTER);
        loginbtn.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 23));
        loginbtn.setBounds(37, 250, 311, 39);
        panel.add(loginbtn);
        loginbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(usertext.getText().isEmpty() || pwdF.getText().isEmpty()){
                    warning.setVisible(true);
                }else {
                    LoginandDispaly l = new LoginandDispaly();
                    l.loginlogic(usertext,pwdF);
                    usertext.setText("");
                    pwdF.setText("");

                }
            }
        });

        warning = new JLabel("Enter the required items");
        warning.setForeground(Color.BLUE);
        warning.setHorizontalAlignment(SwingConstants.CENTER);
        warning.setFont(new Font("Tahoma", Font.PLAIN, 16));
        warning.setBounds(37, 217, 313, 23);
        panel.add(warning);

        JLabel heading = new JLabel("Login Form");
        heading.setForeground(new Color(220, 20, 60));
        heading.setVerticalAlignment(SwingConstants.TOP);
        heading.setFont(new Font("Sylfaen", Font.PLAIN, 30));
        heading.setHorizontalAlignment(SwingConstants.CENTER);
        heading.setBounds(108, 22, 175, 39);
        panel.add(heading);
        warning.setVisible(false);

        JLabel exitL = new JLabel("X");
        exitL.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(JOptionPane.showConfirmDialog(null, "You Want to Exit","Confirmation",JOptionPane.YES_NO_OPTION)== 0) {
                    System.exit(0);
                }
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                exitL.setForeground(Color.RED);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                exitL.setForeground(Color.WHITE);
            }
        });
        exitL.setHorizontalAlignment(SwingConstants.CENTER);
        exitL.setFont(new Font("Times New Roman", Font.PLAIN, 33));
        exitL.setForeground(Color.WHITE);
        exitL.setBounds(745, 0, 101, 77);
        frame.getContentPane().add(exitL);

        JButton newaccountbutton = new JButton("Creat Account");
        newaccountbutton.setBounds(349, 411, 138, 29);
        frame.getContentPane().add(newaccountbutton);
        newaccountbutton.setVerticalAlignment(SwingConstants.TOP);
        newaccountbutton.setHorizontalTextPosition(SwingConstants.CENTER);
        newaccountbutton.setForeground(new Color(0, 191, 255));
        newaccountbutton.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 18));
        newaccountbutton.setBorder(new LineBorder(new Color(240, 255, 255), 5, true));
        newaccountbutton.setBackground(Color.WHITE);

        newaccountbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setVisible(false);
                accountpanel.setVisible(true);
                newaccountbutton.setVisible(false);
            }
        });

        // ------------------------------------- Create Account Panel----------------------------------
        accountpanel = new JPanel();
        accountpanel.setBorder(new LineBorder(new Color(135, 206, 235), 5, true));
        accountpanel.setBackground(new Color(50, 205, 50));
        accountpanel.setBounds(125, 100, 595, 453);
        frame.getContentPane().add(accountpanel);
        accountpanel.setLayout(null);
        accountpanel.setVisible(false);

        JLabel idLabel = new JLabel("ID");
        idLabel.setForeground(new Color(128, 0, 128));
        idLabel.setFont(new Font("Times New Roman", Font.PLAIN, 24));
        idLabel.setVerticalAlignment(SwingConstants.TOP);
        idLabel.setHorizontalAlignment(SwingConstants.CENTER);
        idLabel.setBounds(26, 95, 86, 26);
        accountpanel.add(idLabel);

        JLabel firstNLabel = new JLabel("First Name");
        firstNLabel.setVerticalAlignment(SwingConstants.TOP);
        firstNLabel.setHorizontalAlignment(SwingConstants.CENTER);
        firstNLabel.setForeground(new Color(128, 0, 128));
        firstNLabel.setFont(new Font("Times New Roman", Font.PLAIN, 24));
        firstNLabel.setBounds(10, 141, 121, 26);
        accountpanel.add(firstNLabel);

        JLabel lastNLabel = new JLabel("Last Name");
        lastNLabel.setVerticalAlignment(SwingConstants.TOP);
        lastNLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lastNLabel.setForeground(new Color(128, 0, 128));
        lastNLabel.setFont(new Font("Times New Roman", Font.PLAIN, 24));
        lastNLabel.setBounds(10, 183, 121, 26);
        accountpanel.add(lastNLabel);

        JLabel userNLabel = new JLabel("User Name");
        userNLabel.setVerticalAlignment(SwingConstants.TOP);
        userNLabel.setHorizontalAlignment(SwingConstants.CENTER);
        userNLabel.setForeground(new Color(128, 0, 128));
        userNLabel.setFont(new Font("Times New Roman", Font.PLAIN, 24));
        userNLabel.setBounds(10, 219, 121, 26);
        accountpanel.add(userNLabel);

        JLabel passwardL = new JLabel("Password");
        passwardL.setVerticalAlignment(SwingConstants.TOP);
        passwardL.setHorizontalAlignment(SwingConstants.CENTER);
        passwardL.setForeground(new Color(128, 0, 128));
        passwardL.setFont(new Font("Times New Roman", Font.PLAIN, 24));
        passwardL.setBounds(10, 255, 121, 26);
        accountpanel.add(passwardL);

        JLabel ageL = new JLabel("Age");
        ageL.setVerticalAlignment(SwingConstants.TOP);
        ageL.setHorizontalAlignment(SwingConstants.CENTER);
        ageL.setForeground(new Color(128, 0, 128));
        ageL.setFont(new Font("Times New Roman", Font.PLAIN, 24));
        ageL.setBounds(10, 291, 121, 36);
        accountpanel.add(ageL);

        JLabel semesterL = new JLabel("Semester");
        semesterL.setVerticalAlignment(SwingConstants.TOP);
        semesterL.setHorizontalAlignment(SwingConstants.CENTER);
        semesterL.setForeground(new Color(128, 0, 128));
        semesterL.setFont(new Font("Times New Roman", Font.PLAIN, 24));
        semesterL.setBounds(10, 337, 121, 26);
        accountpanel.add(semesterL);

        idT = new JTextField();
        idT.setHorizontalAlignment(SwingConstants.CENTER);
        idT.setForeground(new Color(128, 0, 128));
        idT.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        idT.setBounds(138, 95, 298, 26);
        accountpanel.add(idT);
        idT.setColumns(10);

        frstT = new JTextField();
        frstT.setHorizontalAlignment(SwingConstants.CENTER);
        frstT.setForeground(new Color(128, 0, 128));
        frstT.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        frstT.setColumns(10);
        frstT.setBounds(141, 141, 295, 26);
        accountpanel.add(frstT);

        lastT = new JTextField();
        lastT.setHorizontalAlignment(SwingConstants.CENTER);
        lastT.setForeground(new Color(128, 0, 128));
        lastT.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lastT.setColumns(10);
        lastT.setBounds(138, 183, 298, 26);
        accountpanel.add(lastT);

        userT = new JTextField();
        userT.setBorder(new LineBorder(new Color(171, 173, 179), 1, true));
        userT.setHorizontalAlignment(SwingConstants.CENTER);
        userT.setForeground(new Color(128, 0, 128));
        userT.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        userT.setColumns(10);
        userT.setBounds(138, 219, 298, 26);
        accountpanel.add(userT);

        passT = new JTextField();
        passT.setHorizontalAlignment(SwingConstants.CENTER);
        passT.setForeground(new Color(128, 0, 128));
        passT.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        passT.setColumns(10);
        passT.setBounds(141, 255, 298, 26);
        accountpanel.add(passT);

        ageT = new JTextField();
        ageT.setHorizontalAlignment(SwingConstants.CENTER);
        ageT.setForeground(new Color(128, 0, 128));
        ageT.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        ageT.setColumns(10);
        ageT.setBounds(138, 300, 298, 26);
        accountpanel.add(ageT);

        semT = new JTextField();
        semT.setHorizontalAlignment(SwingConstants.CENTER);
        semT.setForeground(new Color(128, 0, 128));
        semT.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        semT.setColumns(10);
        semT.setBounds(141, 337, 298, 26);
        accountpanel.add(semT);

        JCheckBox termsCheckB = new JCheckBox("Aggree with Terms");
        termsCheckB.setBackground(new Color(230, 230, 250));
        termsCheckB.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 12));
        termsCheckB.setVerticalAlignment(SwingConstants.TOP);
        termsCheckB.setBounds(26, 380, 135, 26);
        accountpanel.add(termsCheckB);

        JLabel creationheading = new JLabel("Account Creation");
        creationheading.setForeground(new Color(138, 43, 226));
        creationheading.setHorizontalAlignment(SwingConstants.CENTER);
        creationheading.setFont(new Font("Times New Roman", Font.PLAIN, 52));
        creationheading.setBounds(65, 10, 424, 53);
        accountpanel.add(creationheading);

        //======================Create Button ===================================
        JButton creatbtn = new JButton("Create");
        creatbtn.setFont(new Font("Times New Roman", Font.PLAIN, 24));
        creatbtn.setForeground(new Color(0, 0, 139));
        creatbtn.setBounds(233, 385, 135, 36);
        accountpanel.add(creatbtn);
        creatbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if(idT.getText().isEmpty() || frstT.getText().isEmpty() || lastT.getText().isEmpty() || userT.getText().isEmpty() || passT.getText().isEmpty()
                            || ageT.getText().isEmpty() || semT.getText().isEmpty()){
                        throw new InputMismatchException();
                    }
                    else {
                        Insert b1 = new Insert();
                        b1.AddAccount(idT,frstT,lastT,userT,passT,ageT,semT,termsCheckB);
                        accountpanel.setVisible(false);
                        panel.setVisible(true);
                        creatbtn.setVisible(true);
                    }

                }catch (InputMismatchException ep){
                    JOptionPane.showMessageDialog(null,"Feilds Are Empty");
                }
            }
        });

        JLabel exitL_1 = new JLabel("X");
        exitL_1.setHorizontalAlignment(SwingConstants.CENTER);
        exitL_1.setForeground(Color.WHITE);
        exitL_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        exitL_1.setBounds(544, 10, 41, 45);
        accountpanel.add(exitL_1);
        exitL_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(JOptionPane.showConfirmDialog(null, "You Sure You have Account","Confirmation",JOptionPane.YES_NO_OPTION)== 0) {
                    accountpanel.setVisible(false);
                    panel.setVisible(true);
                    newaccountbutton.setVisible(true);
                }
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                exitL_1.setForeground(Color.RED);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                exitL_1.setForeground(Color.WHITE);
            }
        });



    }
}



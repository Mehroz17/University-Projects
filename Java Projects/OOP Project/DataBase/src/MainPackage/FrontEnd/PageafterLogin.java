package MainPackage.FrontEnd;

import MainPackage.BackendLogic.Clock;
import MainPackage.BackendLogic.LoginandDispaly;

import javax.swing.*;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.LineBorder;


public class PageafterLogin {


    private JFrame frame;
    private JLabel HeadingN;
    private JPanel aboutpanel;
    private JPanel updatePanel;
    private JTextField idT;
    private JTextField firstA;
    private JTextField LastA;
    private JTextField userA;
    private JTextField pwdA;
    private JTextField agA;
    private JTextField semA;
    private JTextField pwdU;
    private JTextField agU;
    private JTextField semU;
    private JLabel time;

    //Getter and Setter for the setting of user name in the account page



    public void after(String gettingH) {

        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(0, 100, 0));
        frame.setBounds(100,100,679,560);
        frame.getContentPane().setLayout(null);
// -----------------------------Welcome Panel------------------------------------------
        JPanel welcomepanel = new JPanel();
        welcomepanel.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, new Color(0, 255, 255), new Color(0, 191, 255)));
        welcomepanel.setBackground(new Color(60, 179, 113));
        welcomepanel.setBounds(0, 0, 665, 123);
        frame.getContentPane().add(welcomepanel);
        welcomepanel.setLayout(null);

        JLabel Heading = new JLabel("Welcome ");
        Heading.setHorizontalAlignment(SwingConstants.CENTER);
        Heading.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 35));
        Heading.setForeground(new Color(255, 255, 0));
        Heading.setBounds(119, 32, 211, 53);
        welcomepanel.add(Heading);

        HeadingN = new JLabel();
        HeadingN.setHorizontalAlignment(SwingConstants.CENTER);
        HeadingN.setForeground(Color.YELLOW);
        HeadingN.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 35));
        HeadingN.setBounds(320, 32, 211, 53);
        welcomepanel.add(HeadingN);
        HeadingN.setText(gettingH);

        //----------------------------------About Panel--------------------------------
        aboutpanel = new JPanel();
        aboutpanel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(100, 149, 237), null, null, null));
        aboutpanel.setBackground(new Color(224, 255, 255));
        aboutpanel.setBounds(10, 133, 307, 316);
        frame.getContentPane().add(aboutpanel);
        aboutpanel.setLayout(null);
        aboutpanel.setVisible(false);

        JLabel headingL = new JLabel("About Account");
        headingL.setForeground(new Color(100, 149, 237));
        headingL.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        headingL.setBounds(97, 10, 125, 37);
        aboutpanel.add(headingL);

        JLabel idL = new JLabel("ID");
        idL.setHorizontalAlignment(SwingConstants.LEFT);
        idL.setForeground(new Color(0, 0, 205));
        idL.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        idL.setBounds(10, 57, 41, 37);
        aboutpanel.add(idL);

        JLabel FirstL = new JLabel("First Name");
        FirstL.setHorizontalAlignment(SwingConstants.LEFT);
        FirstL.setForeground(new Color(0, 0, 205));
        FirstL.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        FirstL.setBounds(10, 88, 80, 37);
        aboutpanel.add(FirstL);

        JLabel lastL = new JLabel("Last Name");
        lastL.setHorizontalAlignment(SwingConstants.LEFT);
        lastL.setForeground(new Color(0, 0, 205));
        lastL.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lastL.setBounds(10, 124, 80, 37);
        aboutpanel.add(lastL);

        JLabel userL = new JLabel("User Name");
        userL.setHorizontalAlignment(SwingConstants.LEFT);
        userL.setForeground(new Color(0, 0, 205));
        userL.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        userL.setBounds(10, 157, 80, 37);
        aboutpanel.add(userL);

        JLabel pwdL = new JLabel("Password");
        pwdL.setHorizontalAlignment(SwingConstants.LEFT);
        pwdL.setForeground(new Color(0, 0, 205));
        pwdL.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        pwdL.setBounds(10, 189, 80, 37);
        aboutpanel.add(pwdL);

        JLabel AgeL = new JLabel("Age");
        AgeL.setHorizontalAlignment(SwingConstants.LEFT);
        AgeL.setForeground(new Color(0, 0, 205));
        AgeL.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        AgeL.setBounds(10, 224, 80, 37);
        aboutpanel.add(AgeL);

        JLabel semL = new JLabel("Semester");
        semL.setHorizontalAlignment(SwingConstants.LEFT);
        semL.setForeground(new Color(0, 0, 205));
        semL.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        semL.setBounds(10, 264, 80, 37);
        aboutpanel.add(semL);

        idT = new JTextField();

        idT.setBorder(new LineBorder(new Color(30, 144, 255), 2));
        idT.setForeground(new Color(0, 0, 128));
        idT.setFont(new Font("Times New Roman", Font.PLAIN, 17));

        idT.setBounds(126, 68, 138, 19);
        aboutpanel.add(idT);
        idT.setColumns(10);

        firstA = new JTextField();
        firstA.setBackground(Color.WHITE);

        firstA.setForeground(new Color(0, 0, 128));
        firstA.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        firstA.setEditable(false);
        firstA.setColumns(10);
        firstA.setBorder(new LineBorder(new Color(30, 144, 255), 2));
        firstA.setBounds(126, 99, 138, 19);
        aboutpanel.add(firstA);

        LastA = new JTextField();
        LastA.setBackground(Color.WHITE);

        LastA.setForeground(new Color(0, 0, 128));
        LastA.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        LastA.setEditable(false);
        LastA.setColumns(10);
        LastA.setBorder(new LineBorder(new Color(30, 144, 255), 2));
        LastA.setBounds(126, 135, 138, 19);
        aboutpanel.add(LastA);

        userA = new JTextField();
        userA.setBackground(Color.WHITE);

        userA.setForeground(new Color(0, 0, 128));
        userA.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        userA.setEditable(false);
        userA.setColumns(10);
        userA.setBorder(new LineBorder(new Color(30, 144, 255), 2));
        userA.setBounds(126, 168, 138, 19);
        aboutpanel.add(userA);

        pwdA = new JTextField();
        pwdA.setBackground(Color.WHITE);

        pwdA.setForeground(new Color(0, 0, 128));
        pwdA.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        pwdA.setEditable(false);
        pwdA.setColumns(10);
        pwdA.setBorder(new LineBorder(new Color(30, 144, 255), 2));
        pwdA.setBounds(126, 200, 138, 19);
        aboutpanel.add(pwdA);

        agA = new JTextField();
        agA.setBackground(Color.WHITE);

        agA.setForeground(new Color(0, 0, 128));
        agA.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        agA.setEditable(false);
        agA.setColumns(10);
        agA.setBorder(new LineBorder(new Color(30, 144, 255), 2));
        agA.setBounds(126, 235, 138, 19);
        aboutpanel.add(agA);

        semA = new JTextField();
        semA.setBackground(Color.WHITE);

        semA.setForeground(new Color(0, 0, 128));
        semA.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        semA.setEditable(false);
        semA.setColumns(10);
        semA.setBorder(new LineBorder(new Color(30, 144, 255), 2));
        semA.setBounds(126, 275, 138, 19);
        aboutpanel.add(semA);

        JLabel exitabout = new JLabel("X");
        exitabout.setHorizontalAlignment(SwingConstants.RIGHT);
        exitabout.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        exitabout.setBounds(252, 10, 45, 13);
        aboutpanel.add(exitabout);

        exitabout.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                aboutpanel.setVisible(false);
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                exitabout.setForeground(Color.RED);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                exitabout.setForeground(Color.WHITE);
            }
        });



        //-------------------------------------------------Update Panel------------------------------------------------------------
        updatePanel = new JPanel();
        updatePanel.setLayout(null);
        updatePanel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(100, 149, 237), null, null, null));
        updatePanel.setBackground(new Color(224, 255, 255));
        updatePanel.setBounds(327, 133, 307, 251);
        updatePanel.setVisible(false);
        frame.getContentPane().add(updatePanel);

        JLabel lblUpdateAccount = new JLabel("Update Account");
        lblUpdateAccount.setForeground(new Color(100, 149, 237));
        lblUpdateAccount.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lblUpdateAccount.setBounds(85, 10, 137, 37);
        updatePanel.add(lblUpdateAccount);


        JLabel pwdL_1 = new JLabel("Password");
        pwdL_1.setHorizontalAlignment(SwingConstants.LEFT);
        pwdL_1.setForeground(new Color(0, 0, 205));
        pwdL_1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        pwdL_1.setBounds(10, 62, 80, 37);
        updatePanel.add(pwdL_1);

        JLabel AgeL_1 = new JLabel("Age");
        AgeL_1.setHorizontalAlignment(SwingConstants.LEFT);
        AgeL_1.setForeground(new Color(0, 0, 205));
        AgeL_1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        AgeL_1.setBounds(10, 109, 80, 37);
        updatePanel.add(AgeL_1);

        JLabel semL_1 = new JLabel("Semester");
        semL_1.setHorizontalAlignment(SwingConstants.LEFT);
        semL_1.setForeground(new Color(0, 0, 205));
        semL_1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        semL_1.setBounds(10, 156, 80, 37);
        updatePanel.add(semL_1);



        pwdU = new JTextField();
        pwdU.setForeground(new Color(0, 0, 128));
        pwdU.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        pwdU.setColumns(10);
        pwdU.setBorder(new LineBorder(new Color(30, 144, 255), 2));
        pwdU.setBounds(126, 71, 138, 19);
        updatePanel.add(pwdU);

        agU = new JTextField();
        agU.setForeground(new Color(0, 0, 128));
        agU.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        agU.setColumns(10);
        agU.setBorder(new LineBorder(new Color(30, 144, 255), 2));
        agU.setBounds(126, 118, 138, 19);
        updatePanel.add(agU);

        semU = new JTextField();
        semU.setForeground(new Color(0, 0, 128));
        semU.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        semU.setColumns(10);
        semU.setBorder(new LineBorder(new Color(30, 144, 255), 2));
        semU.setBounds(126, 163, 138, 19);
        updatePanel.add(semU);

        JLabel exitaUp = new JLabel("X");
        exitaUp.setHorizontalAlignment(SwingConstants.RIGHT);
        exitaUp.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        exitaUp.setBounds(252, 10, 45, 13);
        updatePanel.add(exitaUp);
        exitaUp.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                updatePanel.setVisible(false);
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                exitaUp.setForeground(Color.RED);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                exitaUp.setForeground(Color.WHITE);
            }
        });


        JButton kbtn = new JButton("OK");
        kbtn.setFont(new Font("Tahoma", Font.PLAIN, 13));
        kbtn.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.WHITE, null, null, null));
        kbtn.setBackground(Color.ORANGE);
        kbtn.setBounds(85, 207, 117, 21);
        updatePanel.add(kbtn);
        kbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    LoginandDispaly l1 = new LoginandDispaly();
                    l1.update(gettingH,pwdU,agU,semU);
                    pwdU.setText("");
                    agU.setText("");
                    semU.setText("");
            }
        });



        //---------------------------------------------Menue Bar-------------------
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(new Color(175, 238, 238));
        frame.setJMenuBar(menuBar);

        JMenu Upinbar = new JMenu(" Account");
        Upinbar.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        menuBar.add(Upinbar);

        JMenuItem aboutinaccount = new JMenuItem("About Account");
        Upinbar.add(aboutinaccount);
        aboutinaccount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    LoginandDispaly ld = new LoginandDispaly();
                    aboutpanel.setVisible(true);
                    ld.show(idT,firstA,LastA,userA,pwdA,agA,semA,gettingH);
            }
        });

        JMenuItem up = new JMenuItem("Update Account");
        Upinbar.add(up);
        up.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updatePanel.setVisible(true);

            }
        });

        JButton logoutbtn = new JButton("Logout");
        logoutbtn.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.RED, null, null, null));
        logoutbtn.setBackground(Color.CYAN);
        logoutbtn.setForeground(Color.RED);
        logoutbtn.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
        menuBar.add(logoutbtn);
        logoutbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(JOptionPane.showConfirmDialog(null, "You Sure want to Logout","Confirmation",JOptionPane.YES_NO_OPTION)== 0) {
                    JOptionPane.showMessageDialog(null,"You have logout");
                    frame.setVisible(false);
                }
            }
        });

        JButton DeletBtn = new JButton("Delete Account");
        menuBar.add(DeletBtn);
        DeletBtn.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.WHITE, null, null, null));
        DeletBtn.setBackground(Color.WHITE);
        DeletBtn.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
        DeletBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(JOptionPane.showConfirmDialog(null, "You Sure you want to Delete Account","Confirmation",JOptionPane.YES_NO_OPTION)== 0) {
                    LoginandDispaly l = new LoginandDispaly();
                    l.deleteData(gettingH);
                    frame.dispose();
                }
            }
        });


        JButton refreshbtn = new JButton("Referesh");
        refreshbtn.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
        menuBar.add(refreshbtn);
        frame.setVisible(true);
        refreshbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);





    }
}//End Class



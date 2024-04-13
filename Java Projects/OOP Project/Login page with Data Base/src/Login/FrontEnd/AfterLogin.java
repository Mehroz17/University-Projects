package Login.FrontEnd;


import Login.BackEndLogic.LiginandDisplay;

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


public class AfterLogin {



        private JFrame frame;
        private JLabel HeadingN;
        private JPanel aboutpanel;
        private JTextField idT;
        private JTextField firstA;
        private JTextField LastA;
        private JTextField userA;
        private JTextField pwdA;
        private JTextField agA;
        private JTextField semA;
        private JTextField oldPT;
        private JTextField newPT;
        private JTextField userTP;
        private JTextField ageUP;
        private JTextField semUP;
        private JPanel UpdatePassP;
        private JPanel UpdateAP ;



        public void after(String head) {

            frame = new JFrame();
            frame.getContentPane().setBackground(new Color(30, 144, 255));
            frame.setBounds(100,100,675,613);
            frame.getContentPane().setLayout(null);
// -----------------------------Welcome Panel------------------------------------------
            JPanel welcomepanel = new JPanel();
            welcomepanel.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, new Color(0, 255, 255), new Color(0, 191, 255)));
            welcomepanel.setBackground(new Color(0, 0, 128));
            welcomepanel.setBounds(0, 0, 665, 123);
            frame.getContentPane().add(welcomepanel);
            welcomepanel.setLayout(null);

            JLabel Heading = new JLabel("Welcome ");
            Heading.setHorizontalAlignment(SwingConstants.CENTER);
            Heading.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 51));
            Heading.setForeground(new Color(255, 255, 0));
            Heading.setBounds(10, 32, 320, 68);
            welcomepanel.add(Heading);

            HeadingN = new JLabel();
            HeadingN.setHorizontalAlignment(SwingConstants.CENTER);
            HeadingN.setForeground(Color.YELLOW);
            HeadingN.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 51));
            HeadingN.setBounds(340, 32, 289, 68);
            welcomepanel.add(HeadingN);
            HeadingN.setText(head);


            //----------------------------------About Panel--------------------------------
            aboutpanel = new JPanel();
            aboutpanel.setBorder(new LineBorder(new Color(0, 0, 128), 2, true));
            aboutpanel.setBackground(new Color(224, 255, 255));
            aboutpanel.setBounds(10, 133, 307, 316);
            frame.getContentPane().add(aboutpanel);
            aboutpanel.setLayout(null);
            aboutpanel.setVisible(false);

            JLabel headingL = new JLabel("About Account");
            headingL.setForeground(new Color(0, 0, 128));
            headingL.setFont(new Font("Times New Roman", Font.PLAIN, 23));
            headingL.setBounds(97, 10, 145, 37);
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

            //============== Update Password Panel============================================
            UpdatePassP = new JPanel();
            UpdatePassP.setBorder(new LineBorder(new Color(0, 0, 205), 2, true));
            UpdatePassP.setBounds(338, 133, 307, 157);
            frame.getContentPane().add(UpdatePassP);
            UpdatePassP.setVisible(false);
            UpdatePassP.setBackground(new Color(224, 255, 255));
            UpdatePassP.setLayout(null);

            JLabel pwdP = new JLabel("Old Password");
            pwdP.setBackground(new Color(224, 255, 255));
            pwdP.setHorizontalAlignment(SwingConstants.LEFT);
            pwdP.setForeground(new Color(0, 0, 205));
            pwdP.setFont(new Font("Times New Roman", Font.PLAIN, 14));
            pwdP.setBounds(10, 48, 105, 37);
            UpdatePassP.add(pwdP);

            oldPT = new JTextField();
            oldPT.setForeground(new Color(0, 0, 128));
            oldPT.setFont(new Font("Times New Roman", Font.PLAIN, 14));
            oldPT.setColumns(10);
            oldPT.setBorder(new LineBorder(new Color(30, 144, 255), 2));
            oldPT.setBackground(Color.WHITE);
            oldPT.setBounds(157, 57, 113, 19);
            UpdatePassP.add(oldPT);

            JLabel lblEnterNewPassword = new JLabel("Enter New Password");
            lblEnterNewPassword.setHorizontalAlignment(SwingConstants.LEFT);
            lblEnterNewPassword.setForeground(new Color(0, 0, 205));
            lblEnterNewPassword.setFont(new Font("Times New Roman", Font.PLAIN, 14));
            lblEnterNewPassword.setBounds(10, 77, 137, 37);
            UpdatePassP.add(lblEnterNewPassword);

            newPT = new JTextField();
            newPT.setForeground(new Color(0, 0, 128));
            newPT.setFont(new Font("Times New Roman", Font.PLAIN, 14));
            newPT.setColumns(10);
            newPT.setBorder(new LineBorder(new Color(30, 144, 255), 2));
            newPT.setBackground(Color.WHITE);
            newPT.setBounds(157, 86, 113, 19);
            UpdatePassP.add(newPT);

            JButton updatebuttoninPassword = new JButton("Update ");
            updatebuttoninPassword.setBackground(new Color(100, 149, 237));
            updatebuttoninPassword.setBorder(new SoftBevelBorder(BevelBorder.RAISED, new Color(0, 0, 139), null, null, null));
            updatebuttoninPassword.setVerticalAlignment(SwingConstants.TOP);
            updatebuttoninPassword.setFont(new Font("Sitka Small", Font.PLAIN, 15));
            updatebuttoninPassword.setBounds(106, 126, 105, 21);
            UpdatePassP.add(updatebuttoninPassword);
            updatebuttoninPassword.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(newPT.getText().isEmpty()){
                        JOptionPane.showMessageDialog(null,"Enter New Password");
                    }
                    else{
                    LiginandDisplay l = new LiginandDisplay();
                    l.updateP(HeadingN,newPT);}
                }
            });

            JLabel updatepas_1 = new JLabel("Update Password");
            updatepas_1.setHorizontalAlignment(SwingConstants.CENTER);
            updatepas_1.setForeground(Color.BLUE);
            updatepas_1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
            updatepas_1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, new Color(30, 144, 255), null, new Color(30, 144, 255), null));
            updatepas_1.setBackground(Color.YELLOW);
            updatepas_1.setBounds(85, 10, 137, 37);
            UpdatePassP.add(updatepas_1);


            JLabel exitaP = new JLabel("X");
            exitaP.setHorizontalAlignment(SwingConstants.RIGHT);
            exitaP.setFont(new Font("Times New Roman", Font.PLAIN, 17));
            exitaP.setBounds(252, 13, 45, 13);
            UpdatePassP.add(exitaP);
            exitaP.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    UpdatePassP.setVisible(false);
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

            //====================Update Account ====================================

            UpdateAP = new JPanel();
            UpdateAP.setBorder(new LineBorder(new Color(0, 0, 139), 2, true));
            UpdateAP.setBackground(new Color(224, 255, 255));
            UpdateAP.setBounds(338, 300, 307, 239);
            UpdateAP.setVisible(false);
            frame.getContentPane().add(UpdateAP);
            UpdateAP.setLayout(null);

            JLabel headingA = new JLabel("Update Account");
            headingA.setHorizontalAlignment(SwingConstants.CENTER);
            headingA.setForeground(Color.BLUE);
            headingA.setFont(new Font("Times New Roman", Font.PLAIN, 17));
            headingA.setBorder(new SoftBevelBorder(BevelBorder.RAISED, new Color(30, 144, 255), null, new Color(30, 144, 255), null));
            headingA.setBackground(Color.YELLOW);
            headingA.setBounds(83, 10, 137, 37);
            UpdateAP.add(headingA);

            JLabel pwdP_1 = new JLabel("User Name");
            pwdP_1.setHorizontalAlignment(SwingConstants.LEFT);
            pwdP_1.setForeground(new Color(0, 0, 205));
            pwdP_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
            pwdP_1.setBackground(new Color(224, 255, 255));
            pwdP_1.setBounds(10, 66, 105, 37);
            UpdateAP.add(pwdP_1);

            userTP = new JTextField();
            userTP.setForeground(new Color(0, 0, 128));
            userTP.setFont(new Font("Times New Roman", Font.PLAIN, 14));
            userTP.setColumns(10);
            userTP.setBorder(new LineBorder(new Color(30, 144, 255), 2));
            userTP.setBackground(Color.WHITE);
            userTP.setBounds(146, 76, 113, 19);
            UpdateAP.add(userTP);

            JLabel pwdP_1_1 = new JLabel("Age");
            pwdP_1_1.setHorizontalAlignment(SwingConstants.LEFT);
            pwdP_1_1.setForeground(new Color(0, 0, 205));
            pwdP_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
            pwdP_1_1.setBackground(new Color(224, 255, 255));
            pwdP_1_1.setBounds(10, 109, 105, 37);
            UpdateAP.add(pwdP_1_1);

            JLabel pwdP_1_2 = new JLabel("Semester");
            pwdP_1_2.setHorizontalAlignment(SwingConstants.LEFT);
            pwdP_1_2.setForeground(new Color(0, 0, 205));
            pwdP_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
            pwdP_1_2.setBackground(new Color(224, 255, 255));
            pwdP_1_2.setBounds(10, 152, 105, 37);
            UpdateAP.add(pwdP_1_2);

            ageUP = new JTextField();
            ageUP.setForeground(new Color(0, 0, 128));
            ageUP.setFont(new Font("Times New Roman", Font.PLAIN, 14));
            ageUP.setColumns(10);
            ageUP.setBorder(new LineBorder(new Color(30, 144, 255), 2));
            ageUP.setBackground(Color.WHITE);
            ageUP.setBounds(146, 119, 113, 19);
            UpdateAP.add(ageUP);

            semUP = new JTextField();
            semUP.setForeground(new Color(0, 0, 128));
            semUP.setFont(new Font("Times New Roman", Font.PLAIN, 14));
            semUP.setColumns(10);
            semUP.setBorder(new LineBorder(new Color(30, 144, 255), 2));
            semUP.setBackground(Color.WHITE);
            semUP.setBounds(146, 161, 113, 19);
            UpdateAP.add(semUP);

            JButton UPOther = new JButton("Update ");
            UPOther.setVerticalAlignment(SwingConstants.TOP);
            UPOther.setFont(new Font("Sitka Small", Font.PLAIN, 15));
            UPOther.setBorder(new SoftBevelBorder(BevelBorder.RAISED, new Color(0, 0, 139), null, null, null));
            UPOther.setBackground(new Color(100, 149, 237));
            UPOther.setBounds(100, 199, 105, 21);
            UpdateAP.add(UPOther);
            UPOther.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(semUP.getText().isEmpty() || ageUP.getText().isEmpty() || userTP.getText().isEmpty()){
                        JOptionPane.showMessageDialog(null,"Feilds are Empty");
                    }else {
                        LiginandDisplay l = new LiginandDisplay();
                        l.updateother(HeadingN,userTP,ageUP,semUP);

                    }
                }
            });

            JLabel exitinUP = new JLabel("X");
            exitinUP.setHorizontalAlignment(SwingConstants.RIGHT);
            exitinUP.setFont(new Font("Times New Roman", Font.PLAIN, 17));
            exitinUP.setBounds(252, 10, 45, 13);
            UpdateAP.add(exitinUP);
            exitinUP.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    UpdateAP.setVisible(false);
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
                    LiginandDisplay ld = new LiginandDisplay();
                    aboutpanel.setVisible(true);
                    ld.display(HeadingN,idT,firstA,LastA,userA,pwdA,agA,semA);
                }
            });

            JMenu mnNewMenu = new JMenu("Update Account");
            Upinbar.add(mnNewMenu);

            JMenuItem passwordinmenubar = new JMenuItem("Password");
            mnNewMenu.add(passwordinmenubar);
            passwordinmenubar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    UpdatePassP.setVisible(true);
                    LiginandDisplay l = new LiginandDisplay();
                    l.showp(HeadingN,oldPT);
                }
            });

            JMenuItem otherth = new JMenuItem("Other Things");
            mnNewMenu.add(otherth);
            otherth.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    UpdateAP.setVisible(true);
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
                        LiginandDisplay l = new LiginandDisplay();
                        l.deleteAccount(HeadingN);
                        frame.dispose();
                    }
                }
            });


            JButton refreshbtn = new JButton("Referesh");
            refreshbtn.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
            menuBar.add(refreshbtn);
            frame.setVisible(true);


            frame.setVisible(true);
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        }





    }//End Class




package GUI;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends JFrame {


 public void gu()

 {
  //Object
  JFrame j1 = new JFrame("Login Page");
  j1.setVisible(true);
  j1.setSize(500, 600);
  j1.setLayout(null);


  JLabel TITLE = new JLabel();
  TITLE.setBounds(250, 0, 113, 59);
  TITLE.setFont(new java.awt.Font("Calibri Light", 0, 24));
  TITLE.setText("Login Page");
  j1.add(TITLE);
  TITLE.setBorder(new LineBorder(new java.awt.Color(51, 51, 255), 2, true));


// Label 2
  JLabel Username = new JLabel();
  Username.setBounds(50, 100, 200, 20);
  Username.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
  Username.setText("UserName: ");
  Username.setBackground(new Color(0, 255, 255));
  j1.add(Username);

  //Text FeilD
  JTextField name = new JTextField();
  name.setBounds(250, 100, 200, 20);
  name.setBackground(new Color(204, 204, 204));
  name.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
  name.setText(" ");
  j1.add(name);

//Label 3
  JLabel Password = new JLabel();
  Password.setBounds(50, 150, 200, 20);
  Password.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
  Password.setText("Password:");
  Password.setBackground(new Color(0, 255, 255));
  j1.add(Password);
//Text felild of Password
  JPasswordField jPasswordField1 = new JPasswordField();
  jPasswordField1.setBounds(250, 150, 200, 20);
  jPasswordField1.setBackground(new Color(204, 204, 204));
  jPasswordField1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
  ;
  j1.add(jPasswordField1);
// Code adding the component to the parent container - not shown here

//Lable4
  JLabel city = new JLabel();
  city.setBounds(50, 190, 200, 20);
  city.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
  city.setText("City of Employment:");
  city.setBackground(Color.getColor("Blue"));
  j1.add(city);

  //Text Feil
  JTextField cityT = new JTextField();
  cityT.setBounds(250, 190, 200, 20);
  cityT.setBackground(new Color(204, 204, 204));
  cityT.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
  cityT.setText(" ");
  j1.add(cityT);

//Label 5
  JLabel server = new JLabel();
  server.setBounds(50, 240, 200, 20);
  server.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
  server.setText("WEB Server:");
  server.setBackground(Color.getColor("Blue"));
  j1.add(server);

  //Combo BOX
  JComboBox combo = new JComboBox();
  combo.setBounds(250, 240, 200, 20);
  combo.setModel(new DefaultComboBoxModel<>(new String[]{"--WEB Server--", "Multan", "Lahore", "Islamabad", "Karachi"}));
  j1.add(combo);

//Role Label and Radio Button
  JLabel role = new JLabel();
  role.setBounds(50, 320, 200, 20);
  role.setFont(new java.awt.Font("Times New Roman", 0, 18));
  role.setText("Please Specify your Role:");
  role.setBackground(Color.getColor("Blue"));
  j1.add(role);

  JRadioButton ad = new JRadioButton();
  ad.setBounds(250, 310, 200, 20);
  ad.setText("Admin");
  j1.add(ad);

  //Radio Button of Engineer
  JRadioButton eng = new JRadioButton();
  eng.setBounds(250, 330, 200, 20);
  eng.setText("Engineer");
  j1.add(eng);

  JRadioButton Man = new JRadioButton();
  Man.setBounds(250, 350, 200, 20);
  Man.setText("Manager");
  j1.add(Man);

  JRadioButton guest = new JRadioButton();
  guest.setBounds(250, 370, 200, 20);
  guest.setText("Guest");
  j1.add(guest);

//Lable Sign
  JLabel sign = new JLabel();
  sign.setBounds(50, 470, 200, 20);
  sign.setFont(new java.awt.Font("Times New Roman", 0, 18));
  sign.setText("SignIn Options ");
  j1.add(sign);

  //CheckBox
  JCheckBox mail = new JCheckBox();
  mail.setBounds(250, 470, 200, 20);
  mail.setFont(new java.awt.Font("Times New Roman", 0, 18));
  mail.setText("Mail");
  j1.add(mail);

  JCheckBox pay = new JCheckBox();
  pay.setBounds(250, 490, 200, 20);
  pay.setFont(new java.awt.Font("Times New Roman", 0, 18));
  pay.setText("PayRole");
  j1.add(pay);

  JCheckBox Yahoo = new JCheckBox();
  Yahoo.setBounds(250, 520, 200, 20);
  Yahoo.setFont(new java.awt.Font("Times New Roman", 0, 18));
  Yahoo.setText("Yahoo");
  j1.add(Yahoo);


  //Buttons
  JButton s = new JButton();
  s.setText("SignIN");
  s.setFont(new java.awt.Font("Times New Roman", 0, 18));
  s.setBounds(150, 600, 200, 20);
  s.setBackground(new java.awt.Color(0, 153, 204));
  j1.add(s);


  JButton r = new JButton();
  r.setText("Reset");
  r.setFont(new java.awt.Font("Times New Roman", 0, 18));
  r.setBackground(new Color(0, 153, 204));
  r.setBounds(450, 600, 200, 20);
  j1.add(r);


 }

}

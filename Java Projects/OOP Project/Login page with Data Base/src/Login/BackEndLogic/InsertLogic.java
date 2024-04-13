package Login.BackEndLogic;

import javax.swing.*;
import java.sql.*;
import java.util.InputMismatchException;

public class InsertLogic {

    public void AddAccount(JButton btn,JPanel a,JPanel c , JTextField id, JTextField fn , JTextField lT, JTextField un, JTextField passm , JTextField ag , JTextField sem, JCheckBox terms) {
        String Id = id.getText();
        String fr = fn.getText();
        String ln = lT.getText();
        String us = un.getText();
        String pa = passm.getText();
        int age= Integer.parseInt(ag.getText());
        int semester= Integer.parseInt(sem.getText());


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/loginpage", "root", "");
            System.out.println("Connected ");
            String checkinguserandID =  "Select * from students where ID =? and UserName =?";
            PreparedStatement st1 = conn.prepareStatement(checkinguserandID);
            st1.setString(1,Id);
            st1.setString(2,us);
            ResultSet set = st1.executeQuery();

            String query = "Select * from students where UserName = ?";
            PreparedStatement st2 = conn.prepareStatement(query);
            st2.setString(1,us);
            ResultSet set2 = st2.executeQuery();

            if(set.next()){
                JOptionPane.showMessageDialog(null,"Account is Already Present ");
                id.setText("");
                fn.setText("");
                lT.setText("");
                un.setText("");
                passm.setText("");
                ag.setText("");
                sem.setText("");
            }
            else if(set2.next()){
                JOptionPane.showMessageDialog(null,"UserName is already taken");
                un.setText("");
            }

            else {
                String sl = "Insert into students(ID,FirstName,LastName,UserName,Password,Age,Semester) value(?,?,?,?,?,?,?)";
                PreparedStatement st = conn.prepareStatement(sl);
                st.setString(1, Id);
                st.setString(2, fr);
                st.setString(3, ln);
                st.setString(4, us);
                st.setString(5, pa);
                st.setInt(6, age);
                st.setInt(7, semester);
                if(terms.isSelected()){
                    if(JOptionPane.showConfirmDialog(null,"Are You sure That DATA is Correct ","Confirmation",JOptionPane.YES_NO_OPTION)== 0)
                    {
                        st.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Account Created Now Login");
                        id.setText("");
                        fn.setText("");
                        lT.setText("");
                        un.setText("");
                        passm.setText("");
                        ag.setText("");
                        sem.setText("");
                        a.setVisible(true);
                        c.setVisible(false);
                        btn.setVisible(true);
                    }
                }
                else {
                    JOptionPane.showMessageDialog(null,"Terms are Not Selected");
                }
            }
        } catch (SQLException | ClassNotFoundException se) {
            JOptionPane.showMessageDialog(null, "Error");

        }
    }
}
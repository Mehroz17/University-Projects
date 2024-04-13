package MainPackage.BackendLogic;


//This class contains the logic of the login form


import MainPackage.FrontEnd.PageafterLogin;
import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.awt.*;
import java.io.DataInputStream;
import java.sql.*;
import java.util.Scanner;


public class LoginandDispaly {

        private String user = null;
        private String pass;


        //===============Method for Login ====================================
        public void loginlogic(JTextField u ,JTextField pa){

            try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/loginpage", "root", "");
            System.out.println("Connected ");
          user = u.getText();
          pass = pa.getText();

            String query = "Select * from students where UserName =? and Password =?";
            PreparedStatement st = conn.prepareStatement(query);
            st.setString(1,user);
            st.setString(2, pass);

            ResultSet rs = st.executeQuery();
            if(rs.next()){
                PageafterLogin plg = new PageafterLogin();
                plg .after(user);

            }else {
                JOptionPane.showMessageDialog(null,"Invalid User Name or Password");
            }
        }catch (ClassNotFoundException p){
            JOptionPane.showMessageDialog(null,"Class not Found");
        }catch (SQLException l){
           JOptionPane.showMessageDialog(null,"Error");
        }

    }

// End Method of Login Form



    //======================Method for Showing Data=============================


public void show(JTextField id , JTextField fir , JTextField last , JTextField user , JTextField pas , JTextField ag ,JTextField sem,String c){
        try {

            System.out.println(user);
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/loginpage", "root", "");
            System.out.println("Connected ");

            String q = "SELECT `ID`, `FirstName`, `LastName`, `UserName`, `Password`, `Age`, `Semester` FROM `students` WHERE `UserName` = '"+c+"'";
            PreparedStatement st = cn.prepareStatement(q);

            ResultSet sr = st.executeQuery();
            if(sr.next()) {
                id.setText(sr.getString(1));
                fir.setText(sr.getString(2));
                last.setText(sr.getString(3));
                user.setText(sr.getString(4));
                pas.setText(sr.getString(5));
                ag.setText(sr.getString(6));
                sem.setText(sr.getString(7));
            }else {
                System.out.println("Data Not Found");

            }
        }catch (ClassNotFoundException sf){
            System.out.println("Class not found");
        }catch (SQLException se){
            System.out.println(se);
        }
}




//=================================Delete Method =================================================

    public  void deleteData( String c){
        System.out.println(c + "is being deleted");
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/loginpage", "root", "");
            System.out.println("Connected ");

            String q = "Delete from students where UserName  = '"+c+"'";
            PreparedStatement st = conn.prepareStatement(q);
            st.executeUpdate();
            JOptionPane.showMessageDialog(null,"Deleted");
        } catch (SQLException | ClassNotFoundException se) {
            JOptionPane.showMessageDialog(null,se);

        }
    }// End Delete Method



    //=================== Update Method===============================
    public void update(String c,  JTextField pass , JTextField ag, JTextField sem) {
        try {


            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/loginpage", "root", "");
            System.out.println("Connected ");

            String upq = "UPDATE `students` SET `Password`=?,`Age`=? ,`Semester`=?  WHERE UserName = ?";
            PreparedStatement st = cn.prepareStatement(upq);
            st.setString(1,pass.getText());
            st.setString(2,ag.getText());
            st.setString(3,sem.getText());
            st.setString(4,c);
            st.executeUpdate();
            JOptionPane.showMessageDialog(null,"UPdated");


        } catch (ClassNotFoundException sf) {
            System.out.println("Class not found");
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null,"ALL Feild Must be filed");
        }







    }//End Method





}//End Class

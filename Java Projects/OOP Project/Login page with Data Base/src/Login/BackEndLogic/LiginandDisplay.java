package Login.BackEndLogic;

import Login.FrontEnd.AfterLogin;
import Login.FrontEnd.Login;

import javax.swing.*;
import java.sql.*;

public class LiginandDisplay {



    //==============Method for Login==========================

private String user = null;
private String pass = null;

    public void login(JTextField us , JTextField paa){
        try {
            user = us.getText();
            pass = paa.getText();
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/loginpage", "root", "");
            Statement smt=cn.createStatement();
            System.out.println("Connected ");

            String query = "Select *  from students where UserName = ? and Password = ?";
            PreparedStatement st = cn.prepareStatement(query);
            st.setString(1,user);
            st.setString(2,pass);
            ResultSet sr = st.executeQuery();
            if(sr.next()){
                AfterLogin af = new AfterLogin();
                af.after(user);
                us.setText("");
                paa.setText("");

            }
            else {
                JOptionPane.showMessageDialog(null,"Invalid User Name or Password");
            }


        } catch (ClassNotFoundException e) {
         JOptionPane.showMessageDialog(null,"Connection Error");
        } catch (SQLException throwables) {
            JOptionPane.showMessageDialog(null,"Error");
        }

    }//ENd Login method

    //=============Mehod to show data about the account====================
    public void display(JLabel head , JTextField ID , JTextField first , JTextField last , JTextField user,JTextField pass, JTextField age, JTextField sem){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/loginpage", "root", "");
            Statement smt=cn.createStatement();
            System.out.println("Connected ");
//SELECT * FROM `students` WHERE  UserName = ?
           String q ="select * from students where UserName = '?'";
            PreparedStatement st = cn.prepareStatement(q);
            st.setString(1,head.getText());
            ResultSet rs=smt.executeQuery(q);
            if(rs.next())
            {
                System.out.println(rs.getString(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4)+","+rs.getString(5));
                ID.setText(rs.getString(1));
                first.setText(rs.getString(2));
                last.setText(rs.getString(3));
                user.setText(rs.getString(4));
                pass.setText(rs.getString(5));
                age.setText(rs.getString(6));
                sem.setText(rs.getString(7));
            }
            else
            {
                System.out.println("Record Not Found...");
            }
            cn.close();
        }
        catch(Exception e){
            System.out.println(e);
        }

    }//End Method

    //==================Delete Method=======================
    public void deleteAccount(JLabel head){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/loginpage", "root", "");
            Statement smt=cn.createStatement();
            System.out.println("Connected ");

            String query = "DELETE FROM `students` WHERE `UserName`=?";
            PreparedStatement st = cn.prepareStatement(query);
            st.setString(1,head.getText());
            st.executeUpdate();
            JOptionPane.showMessageDialog(null,"Account Deleted");

        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,"Connection Error");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }// End Delete Method

//Show Password in the password update panel
    public void showp(JLabel head,JTextField p){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/loginpage", "root", "");
            Statement smt=cn.createStatement();
            System.out.println("Connected ");

            String q = "SELECT * FROM `students` WHERE  UserName = ?";
            PreparedStatement st = cn.prepareStatement(q);
            st.setString(1,head.getText());
            ResultSet sr = st.executeQuery();
            if (sr.next()){
            p.setText(sr.getString(5));}

        }catch (ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,"Class not found");
        }catch (SQLException se){
            System.out.println(se);
        }
    }//End Show Password

    //=========Update Password==================
    public void updateP(JLabel head , JTextField pass){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/loginpage", "root", "");
            Statement smt=cn.createStatement();
            System.out.println("Connected ");

            String q = "update students set Password=? where UserName = ?";
            PreparedStatement st = cn.prepareStatement(q);
            st.setString(1,pass.getText());
            st.setString(2,head.getText());
            st.executeUpdate();
            JOptionPane.showMessageDialog(null,"Updated");
            pass.setText("");
        }catch (ClassNotFoundException se){
            JOptionPane.showMessageDialog(null,"Connection Error");
        }catch (SQLException se){
            System.out.println(se);
        }


    }//End Method



    //==== Update the others=============
    public void updateother(JLabel head , JTextField userT, JTextField ageT ,JTextField semT){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/loginpage", "root", "");
            Statement smt=cn.createStatement();
            System.out.println("Connected ");

            String chekinguser = "Select * from students where Username = ?";
            PreparedStatement st1 = cn.prepareStatement(chekinguser);
            st1.setString(1,userT.getText());
            ResultSet set = st1.executeQuery();
            if(set.next()){
                JOptionPane.showMessageDialog(null,"User Name is already taken");
                userT.setText("");
            }
            else {
                String q = "update students set UserName =? , Age = ? , Semester=?  where UserName = ? ";
                PreparedStatement st = cn.prepareStatement(q);
                st.setString(1, userT.getText());
                st.setString(2, ageT.getText());
                st.setString(3, semT.getText());
                st.setString(4, head.getText());
                st.executeUpdate();
                JOptionPane.showMessageDialog(null, "Updaated");
                userT.setText("");
                ageT.setText("");
                semT.setText("");
            }
        }catch (ClassNotFoundException e){
            System.out.println(e);
        }catch (SQLException se){
            System.out.println(se);
        }
    }


}//End Class

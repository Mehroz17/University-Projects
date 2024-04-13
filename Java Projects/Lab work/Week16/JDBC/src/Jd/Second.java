package Jd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Second {
 public static void main(String[] args) throws SQLException {
//    String sn;
//    String pa;
//    String se;
//
//     Scanner input = new Scanner(System.in);
//     System.out.print("Enter the name: ");
//     sn =  input.nextLine();
//     System.out.print("Enter the department: ");
//     pa =  input.nextLine();
//     System.out.print("Enter semester: ");
//     se =  input.nextLine();


        Connection connection = null;
        String u = "root";
        String p = " ";
        String ur = "jdbc:mysql://localhost/first";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); //loading drivers
            connection= DriverManager.getConnection(u,p,ur);
            System.out.println("Connected to data bsase");
            Statement statement =  connection.createStatement();

            //inserting data
            String q = "Insert into sp(SN, P, S) values ('Ali','BSE','3')";
            //String q = "Insert into sp (SN,P,S) value(sn , pa ,se)";
            statement.executeUpdate(q);
            System.out.println("inserted Succefuly");



        }catch (ClassNotFoundException e){
            System.out.println("Class not found");
        }catch (SQLException e){
            System.out.println("Connection not Established");
        }
    }
}

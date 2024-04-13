package Jd;

import java.sql.*;

//implemntaion of the Msql
public class Implementaion {

    public static void main(String[] args) throws SQLException {

        //A Connection object's database is able to provide information
        // describing its tables, its supported SQL grammar,
        // its stored procedures, the capabilities of this connection,
        // and so on. This information is obtained with the getMetaData method.

//  Class DriverManager class is also important
        // The basic service for managing a set of JDBC drivers.


        // there is a method in java naemes Class.forName()
        // in this method we pass string

        //First Step
        // whenever we are making a connection first step is to load drivers
        // those driver that will enable you to connect to the data base


        Connection  connection = null;
        String usename  = "root";
        String password = "";
        // you are telling the path of database
        String url = "jdbc:mysql://localhost/undergraduate";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //loading drivers
            connection= DriverManager.getConnection(url,usename,password);
            System.out.println("Connected to data bsase");
          Statement statement =  connection.createStatement(); // this will creates statement object
           //Updaete Record
//            String uQ = "Update Student set Program ='Mathematics' where StudentName = 'Usman' ";
//            statement.executeUpdate(uQ);
//            System.out.println("Record Updated");

             //Insert Record
          String insertQuery = "Insert into students (StudentName, Program , Semester) values ('Mehroz','softwareEnginerring','2')";
          statement.executeUpdate(insertQuery);
          System.out.println("inserted Succefuly");
//
//            String query = "INSERT INTO Student (StudentName, Program,Semester) VALUES ('saim', 'BSE','2')";
//            PreparedStatement preparedStmt = connection.prepareStatement(query);
//            preparedStmt.execute();
          //Delet
//            String d = "Delete form Student where Program = 'Mathematics' and StudentName = 'Ali'";
//            statement.executeUpdate(d);
//            System.out.println("Record deleted");


        }catch (ClassNotFoundException e){
            System.out.println("Class not found ");
        }catch (SQLException e){
            System.out.println("Can not connect to data base");
        }
        finally {
            System.out.println("Conncetion is Closed ");
            connection.close();  // conection is closed
        }


    }
}

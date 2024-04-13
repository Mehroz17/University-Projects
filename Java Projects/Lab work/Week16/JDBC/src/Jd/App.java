package Jd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {

	public static void main(String[] args) throws SQLException {
		
		Connection connection = null;
		
		String username = "root";
		String password = "";
		String uri = "jdbc:mysql://localhost/undergraduate";
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(uri, username, password);
			System.out.println("Connected to the database.");
			
			Statement statement = connection.createStatement(); //creates a statement object
			
			// delete record 
			
		/*	String deleteRecord = "delete from student where program = 'Mathematics' and studentName = 'Ali'";
			statement.executeUpdate(deleteRecord);
			System.out.println("Record deleted");*/
			
			System.out.println("Fetching records....");
			
			String viewRecord = "Select * from student";
			ResultSet result = statement.executeQuery(viewRecord); //result will come in form of array
 			
			while(result.next()){
	            //Display values
	            System.out.println("Student Name : " + result.getString("studentName"));
	            System.out.println("Program : " + result.getString("program"));
	            System.out.println("Semester : " + result.getInt("semester"));
	         }
			
			
			// update record
			
			/*String updateQuery = "update student set program = 'Management Sciences' where studentName = 'Ahmad' and semester = 3 ";
			statement.executeUpdate(updateQuery);
			System.out.println("Record updated.");*/
			
			//Insert record
			/*  String insertQuery = "insert into student (studentName, program, semester) values ('Usman','Computer Science',2)";
			statement.executeUpdate(insertQuery);
			System.out.println("Record inserted.");*/
			
		} catch (ClassNotFoundException e) {
			System.out.println("Dear user, plz try again later.");
		} catch (SQLException e) {
			System.out.println("Cannot connect to the database.");
		}
		finally {
			System.out.println("Connection to the database closed.");
			connection.close();
		}
		
	}

}

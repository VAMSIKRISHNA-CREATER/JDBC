package assignments03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementExampleProgram {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // chance to get classCastException
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
			//connection is an interface we can not create object that's why we are using getConnection(S,S,S) helper method here
			//sqlException due to invalid details
			// if link is wrong then communication Exception 
			Statement statement = connection.prepareStatement("CREATE TABLE DEMO.RAJAN (NAME CARCHAR(20));");
			
			System.out.println(statement);
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

	
}

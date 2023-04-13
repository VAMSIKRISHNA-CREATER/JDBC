package assignments03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PrintingConnectionObject {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // chance to get classCastException
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
			//connection is an interface we can not create object that's why we are using getConnection(S,S,S) helper method here
			//sqlExce[tion due to wrong creadisentials
			// if link is wrong then communication Exception 
			System.out.println(connection);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}
}
 
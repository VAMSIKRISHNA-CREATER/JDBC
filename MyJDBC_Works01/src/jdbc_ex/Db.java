package jdbc_ex;
import java.util.Scanner;
import java.sql.*;
import com.mysql.cj.jdbc.Driver;
public class Db {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new Driver());
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?user=root&password=root");	
			PreparedStatement pS = conn.prepareStatement("select * from tarzan");
		    System.out.println(pS);
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

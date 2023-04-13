package jdbc_ex;
import java.sql.*;
import com.mysql.cj.jdbc.Driver;
public class TestP5{

	public static void main(String[] args) {
		
		try {
			DriverManager.registerDriver(new Driver());
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			System.out.println(conn);
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

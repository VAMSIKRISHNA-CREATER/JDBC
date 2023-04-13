package jdbc_ex;
import java.sql.*;
public class TestP3 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment","root","root");
			Statement st = conn.createStatement();
			st.execute("update t1 set lname='krishna varma' where lname='vamsi'");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}
}

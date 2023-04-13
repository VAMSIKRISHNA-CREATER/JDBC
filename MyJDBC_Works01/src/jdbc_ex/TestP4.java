package jdbc_ex;
import java.sql.*;
public class TestP4 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment","root","root");
			Statement st = conn.createStatement();
			st.execute("delete from t1 where lname='suraj'");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

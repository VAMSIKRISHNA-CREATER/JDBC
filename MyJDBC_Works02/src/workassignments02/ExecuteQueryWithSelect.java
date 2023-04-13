package workassignments02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteQueryWithSelect {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?user=root&password=root");
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from emp");
//			System.out.println(rs);
//			st.close();
//			System.out.println(rs);
			while(rs.next()) {
				System.out.println("EMP ID : "+rs.getInt(1));
				System.out.println("EMP AGE: "+rs.getInt(2));
				System.out.println("EMO PHO: "+rs.getLong(3));
				System.out.println("--------------------------");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}

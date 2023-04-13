package worksassignments01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class GetConnectionWithURLUSERPASSWORD {
	static final String URL = "jdbc:mysql://localhost:3306/demo";
	static final String USER = "root";
	static final String PASSWORD = "root";
	public static void main(String[] args) {
		try {
			Connection conn=DriverManager.getConnection(URL,USER,PASSWORD);
			Statement st = conn.createStatement();
			System.out.println(st.execute("SELECT * FROM emp"));
		    st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}

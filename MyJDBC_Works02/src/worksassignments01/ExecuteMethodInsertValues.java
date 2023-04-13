package worksassignments01;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteMethodInsertValues {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // chance to get classCastException
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
			//connection is an interface we can not create object that's why we are using getConnection(S,S,S) helper method here
			//sqlException due to invalid data input
			// if link is wrong then communication Exception 
			Statement st = conn.createStatement();
			st.execute("INSERT INTO EMPD VALUES(102,'RAJAN',2,25000)");
			st.execute("INSERT INTO EMPD VALUES(103,'BALAKRISHNA',5,75000)");
			st.execute("INSERT INTO EMPD VALUES(104,'SIVA SANKAR',2,25000)");
			st.execute("INSERT INTO EMPD VALUES(105,'DILEEP REDDY',2,25000)");
			st.execute("INSERT INTO EMPD VALUES(106,'VISWA VARDHAN',6,100000)");
			st.execute("INSERT INTO EMPD VALUES(107,'RAM GOPAL VARMA',2,45000)");
			st.execute("INSERT INTO EMPD VALUES(108,'SRI REDDY',2,25000)");
			st.execute("INSERT INTO EMPD VALUES(109,'VANI',3,45000)");
			st.execute("INSERT INTO EMPD VALUES(110,'NALINI',2,25000)");
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
	
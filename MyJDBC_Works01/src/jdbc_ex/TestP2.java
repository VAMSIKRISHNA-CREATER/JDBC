package jdbc_ex;
import java.sql.*;
public class TestP2 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment","root","root");
			Statement st = conn.createStatement();
			st.execute("insert into t1 values (551,'parimi','srinu',2,'guntur')");
			st.execute("insert into t1 values (552,'pathallapalli','vamsi',2,'gacchibowli')");
			st.execute("insert into t1 values (553,'pothineni','syam',2,'miyapur')");
			st.execute("insert into t1 values (554,'puppalla','sivaram',2,'erragadda')");
			st.execute("insert into t1 values (555,'rajupalem','srivasthsa',2,'irrumanzil')");
			st.execute("insert into t1 values (556,'sadineni','bharavi',2,'ameerpeta')");
			st.execute("insert into t1 values (557,'sarikonda','ramaraju',2,'SRnagar')");
			st.execute("insert into t1 values (558,'amere','suraj',2,'gundram')");
			st.execute("insert into t1 values (559,'tinnaluri','sandeep',3,'tadikonda')");
			st.execute("insert into t1 values (560,'shaik','srinu',2,'pedanavu')");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

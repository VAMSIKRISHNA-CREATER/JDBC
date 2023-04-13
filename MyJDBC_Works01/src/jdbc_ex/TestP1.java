package jdbc_ex;
import java.sql.*;
import java.util.Scanner;
public class TestP1 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment","root","root");
			Statement st = conn.createStatement();
			String query="create table assignment.T1(voteid int primary key,fname varchar(20) not null,lname varchar(20) not null,cvoted int not null,vbooth varchar(15) not null)";
			st.execute(query);
		} 	
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}

package workassignments02;
import  java.util.*;
import  java.io.FileInputStream;
import  java.io.IOException;
import  java.sql.*;
import  com.mysql.cj.jdbc.Driver;
public class TestPropertiesProgram {
	public static void main(String[] args) {
		try {
			Properties pt = new Properties();
			FileInputStream ufile = new FileInputStream("dbvamsi.properties");
			pt.load(ufile);
			DriverManager.registerDriver(new Driver());
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306",pt);
			System.out.println(conn);
		} catch (SQLException | IOException e) {
			
			e.printStackTrace();
		}
		
		
	}
}

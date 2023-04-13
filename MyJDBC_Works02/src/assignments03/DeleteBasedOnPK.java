package assignments03;
import java.util.Scanner;
import com.mysql.cj.jdbc.Driver;
import java.sql.*;
public class DeleteBasedOnPK {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new Driver());
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?user=root&password=root");
			PreparedStatement pS = conn.prepareStatement("delete from demo.tarzan where uid=? ");
			System.out.println("Uid : ");
			int uid = sc.nextInt();
			pS.setInt(1,uid);
			int count=pS.executeUpdate();
			if(count!=0)
				System.out.println("Data deleted....!");
			else
				System.out.println("Check ur db once");
			conn.close();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

package assignments03;
import java.sql.*;
import java.util.Scanner;
public class PlaceHolders1ExampleDataSaving {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
			PreparedStatement ob = conn.prepareStatement("insert into demo.tarzan values(?,?,?)");
			System.out.print("Enter No.Of Records  :  ");
			int reco=sc.nextInt();
			System.out.println();
			for(int i=0;i<reco;i++) {
				System.out.print(i+" record data :");
				System.out.println();
				System.out.print("Enter uid : ");
				int uid=sc.nextInt();
				ob.setInt(1,uid);
				System.out.println();
				System.out.print("Enter name :  ");
				String name=sc.next();
				ob.setString(2,name);
				System.out.println();
				System.out.print("Enter age : ");
				int age=sc.nextInt();
				ob.setInt(3,age);
				System.out.println();
				ob.execute();
			}
			System.out.println("Data Saved");
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}

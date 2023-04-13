package assignments03;
import java.sql.*;
import java.util.Scanner;
public class UpdateOperation {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
		    PreparedStatement st = conn.prepareStatement("update tarzan set name=?,age=? where uid=?");
		    System.out.println("Enter new name : ");
		    String nname=sc.next();
		    st.setString(1, nname);
		    System.out.println("Enter your age : ");
		    int agee=sc.nextInt();
		    st.setInt(2, agee);
		    System.out.println("Enter uid : ");
		    int uid= sc.nextInt();
		    st.setInt(3, uid);
		    st.execute();
		    System.out.println("Data updated done...!");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}
}

package DemoPractice;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.Statement;

public class executeUpdate {

	public static void main(String[] args) throws Exception {
		
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String uname = "root";
		String pass = "root";
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url , uname , pass);
		
		Statement stmt = con.createStatement();
		
		int count  = stmt.executeUpdate("insert into student values(4 , 'XYZ')");
		
		System.out.println(count + "row/s affected");
		
		stmt.close();
		con.close();

	}

}

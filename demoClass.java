package DemoPractice;

import java.sql.*;

public class demoClass {
	
	public static void main(String []args) throws Exception {
		
		String username = "root";
		String password = "root";
		String url = "jdbc:mysql://localhost:3306/jdbc";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url , username , password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select name from student where id = 2");
		rs.next();
		String name = rs.getString("name");
		System.out.println(name);
		stmt.close();
		con.close();
		
		
		
	}

}

package DemoPractice;

import java.sql.*;

public class getData {

	public static void main(String[] args) throws Exception {
		
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String uname = "root";
		String pass = "root";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url , uname , pass);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from student");
		
		String StudentsData;
		
		while(rs.next()) {
			
			StudentsData = rs.getInt(1)+" : "+rs.getString(2);
			System.out.println(StudentsData);
		}
		
		stmt.close();
		con.close();
		
		
	}

}

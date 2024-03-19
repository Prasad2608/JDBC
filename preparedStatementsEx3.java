package com.preparedStatements;

import java.sql.*;
import java.util.Scanner;
import java.util.Properties;
import java.io.*;

public class preparedStatementsEx3 {

	public static void main(String[] args) throws Exception{
		
Scanner sc = new Scanner(System.in);
		
		Properties properties = new Properties();
		
		properties.load(new FileInputStream("access.properties"));
		
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		String url = properties.getProperty("url");
		String driverClassName = properties.getProperty("driver-class-name");
		
		Class.forName(driverClassName);
		
		Connection connection = DriverManager.getConnection(url , username , password);
		
		System.out.println("Access Granted");
		
		PreparedStatement preparedstatement = connection.prepareStatement("delete from student where id = ?");
		
		
		System.out.println("Enter id :");
		int id = sc.nextInt();
		
		preparedstatement.setInt(1, id);
	  
		
		preparedstatement.executeUpdate();

	}

}

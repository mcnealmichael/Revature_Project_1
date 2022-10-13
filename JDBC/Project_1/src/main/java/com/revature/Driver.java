package com.revature;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Driver {

	public static void main(String[] args) {
		
		//start by getting a connection
				Properties props = new Properties();
				try(FileReader reader = new FileReader("src/main/resources/application.properties")){
					props.load(reader);
				}catch(IOException e) {
					e.printStackTrace();
				}
				
				Statement stmt = null;
				ResultSet set = null;
				final String SQL = "SELECT * FROM ticket_reimbursement where ticket_status = 'pending'";
				
				Connection conn = null;
				
				try {
				conn = DriverManager.getConnection(
						props.getProperty("url"), 
						props.getProperty("username"), 
						props.getProperty("password")
					);
				
				try(Connection connection = DriverManager.getConnection(
						System.getenv("url"), 
						System.getenv("db_username"), 
						System.getenv("db_password")
					)){
					stmt = connection.createStatement();
					
					set = stmt.executeQuery(SQL);
					
					set.next();
					
					//Scanner scanner = new Scanner(System.in);
					
					
					System.out.println(set.getInt(1));
					System.out.println(set.getString(2));
					System.out.println(set.getString(3));
					System.out.println(set.getString(4));
					System.out.println(set.getInt(5));
					
				}
				
				}catch(SQLException e) {
					e.printStackTrace();
				}finally {
					try {
						set.close();
						stmt.close();
					}catch(SQLException e) {
						e.printStackTrace();
					}
				}

	}

}
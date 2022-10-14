package com.revature.dao;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.revature.model.Employees;

public class EmployeeDAO {
	
	public void save(Employees employee) {
		
		Statement stmt = null;
		Properties props = new Properties();
		
		try(FileReader reader = new FileReader("src/main/resources/application.properties")){
			props.load(reader);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		final String SQL = "INSERT INTO employees VALUES (?, ?, ?)";
		
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(
					props.getProperty("url"), 
					props.getProperty("username"), 
					props.getProperty("password")
				);
			try(Connection conn2 = DriverManager.getConnection(
					System.getenv("url"),
					System.getenv("db_username"),
					System.getenv("db_password")
				)){
				stmt = conn2.createStatement();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	/*
	public List<Employees> findAll(){
		
		List<Employees> employee = new ArrayList<>();
		
		return null;
		
	}
	*/
}

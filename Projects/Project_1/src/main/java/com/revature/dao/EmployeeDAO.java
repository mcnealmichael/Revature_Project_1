package com.revature.dao;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import com.revature.model.Employees;
import com.revature.util.ConnectionFactory;

public class EmployeeDAO {

public void save(Employees employee) {
		
		PreparedStatement stmt = null;
		final String SQL = "INSERT INTO employees VALUES(DEFAULT, ?, ?, ?)";
		
		try(Connection conn = ConnectionFactory.getConnection()){
			stmt = conn.prepareStatement(SQL);
			stmt.setString(1, employee.getFirst_name());
			stmt.setString(2, employee.getLast_name());
			stmt.setString(3, employee.getPosition_title());
			stmt.execute();
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
		
}
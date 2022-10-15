package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.revature.model.Employees;
import com.revature.model.Reimbursement_Login;
import com.revature.util.ConnectionFactory;

public class LoginDAO {
	
	public void addUserNamePassword (Reimbursement_Login register, Employees employee) {
		
		PreparedStatement stmt = null;
		final String SQL = "SELECT * FROM employees JOIN reimbursement_login ON employees.employee_id ";
		
		try(Connection conn = ConnectionFactory.getConnection()){
			stmt = conn.prepareStatement(SQL);
			stmt.setString(1, register.getUser_name());
			stmt.setString(2, register.getUser_password());
			stmt.setString(3, employee.getFirst_name());
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

	public void verifyLogin(Reimbursement_Login verifyUsername) {
		
		PreparedStatement stmt = null;
		final String SQL = "SELECT FROM reimbursement_login WHERE username = ?";
		
		try(Connection conn = ConnectionFactory.getConnection()){
			stmt = conn.prepareStatement(SQL);
			stmt.setString(1, System.getenv(SQL));
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

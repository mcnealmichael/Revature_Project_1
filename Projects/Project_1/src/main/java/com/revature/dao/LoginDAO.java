package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.revature.model.Employees;
import com.revature.model.Reimbursement_Login;
import com.revature.util.ConnectionFactory;

public class LoginDAO {
	
	public void login () {
		
		
		
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
	
	public void userLogin(Reimbursement_Login userName) {
		
		Scanner scanner = new Scanner(System.in);
		
		PreparedStatement stmt = null;
		final String SQL = "SELECT FROM reimbursement_login WHERE username = ?";
		
		try(Connection conn = ConnectionFactory.getConnection()){
			stmt = conn.prepareStatement(SQL);
			stmt.setString(1, userName.getUser_name());
			stmt.execute();
			if(userName.equals(scanner)) {
				System.out.println("Username accepted");
			}
			else {
				System.out.println("Username denied");
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
		
		
		
	
	
}

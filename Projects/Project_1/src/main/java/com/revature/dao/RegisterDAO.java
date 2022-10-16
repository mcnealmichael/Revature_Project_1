package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.revature.model.Employees;
import com.revature.model.Reimbursement_Login;
import com.revature.util.ConnectionFactory;

public class RegisterDAO {

	public void save(Employees employee) {

		PreparedStatement stmt = null;
		final String SQL = "INSERT INTO employees VALUES(DEFAULT, ?, ?, DEFAULT)";

		try (Connection conn = ConnectionFactory.getConnection()) {
			stmt = conn.prepareStatement(SQL);
			stmt.setString(1, employee.getFirst_name());
			stmt.setString(2, employee.getLast_name());
			stmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public void newUser(Reimbursement_Login user) {

		PreparedStatement stmt = null;
		final String SQL = "INSERT INTO reimbursement_login VALUES(DEFAULT, ?, ?)";

		try (Connection conn = ConnectionFactory.getConnection()) {
			stmt = conn.prepareStatement(SQL);
			stmt.setString(1, user.getUser_name());
			stmt.setString(2, user.getUser_password());
			stmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}

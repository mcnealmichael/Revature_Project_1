package com.revature.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.revature.util.ConnectionFactory;

/*
 * This class follows what we call the Data Access Object (DAO) design pattern.  This design pattern
 * emphasizes separating the concern of data accessfrom other concerns.  In essence, we have a dedicated class
 * that handles accessing data.
 */

public class PersonRepository {

	public void save(Person person) {
		
		PreparedStatement stmt = null;
		final String SQL = "INSERT INTO person VALUES (DEFAULT, ?, ?, ?, ?)";
		
		try(Connection conn = ConnectionFactory.getConnection()){
			stmt = conn.prepareStatement(SQL);
			stmt.setString(1, person.person_name);
			stmt.setString(2, person.person_state);
			stmt.setString(3, person.person_color);
			stmt.setInt(4, person.person_age);
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

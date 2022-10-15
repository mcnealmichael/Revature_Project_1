package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.revature.model.Reimbursement_Ticket;
import com.revature.util.ConnectionFactory;

public class TicketDAO {

	public void createTicket(Reimbursement_Ticket newTicket) {
		
		PreparedStatement stmt = null;
		final String SQL = "INSERT INTO reimbursement_ticket VALUES(DEFAULT, ?, ?, ?, ?)"; 
		
		try(Connection conn = ConnectionFactory.getConnection()){
			stmt = conn.prepareStatement(SQL);
			stmt.setString(1, newTicket.getLast_name());
			stmt.setString(2, newTicket.getTicket_description());
			stmt.setFloat(3, newTicket.getTicket_amount());
			stmt.setString(4, newTicket.getTicket_status());
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

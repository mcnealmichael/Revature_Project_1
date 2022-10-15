package com.revature.model;

import java.util.Objects;

public class Reimbursement_Ticket {

	private String last_name;
	private String ticket_description;
	private float ticket_amount;
	private String ticket_status;
	public Reimbursement_Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Reimbursement_Ticket(String last_name, String ticket_description, float ticket_amount,
			String ticket_status) {
		super();
		this.last_name = last_name;
		this.ticket_description = ticket_description;
		this.ticket_amount = ticket_amount;
		this.ticket_status = ticket_status;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getTicket_description() {
		return ticket_description;
	}
	public void setTicket_description(String ticket_description) {
		this.ticket_description = ticket_description;
	}
	public float getTicket_amount() {
		return ticket_amount;
	}
	public void setTicket_amount(float ticket_amount) {
		this.ticket_amount = ticket_amount;
	}
	public String getTicket_status() {
		return ticket_status;
	}
	public void setTicket_status(String ticket_status) {
		this.ticket_status = ticket_status;
	}
	@Override
	public int hashCode() {
		return Objects.hash(last_name, ticket_amount, ticket_description, ticket_status);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reimbursement_Ticket other = (Reimbursement_Ticket) obj;
		return Objects.equals(last_name, other.last_name)
				&& Float.floatToIntBits(ticket_amount) == Float.floatToIntBits(other.ticket_amount)
				&& Objects.equals(ticket_description, other.ticket_description)
				&& Objects.equals(ticket_status, other.ticket_status);
	}
	@Override
	public String toString() {
		return "Reimbursement_Ticket [last_name=" + last_name + ", ticket_description=" + ticket_description
				+ ", ticket_amount=" + ticket_amount + ", ticket_status=" + ticket_status + "]";
	}
	
}

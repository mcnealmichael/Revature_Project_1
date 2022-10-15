package com.revature.model;

import java.util.Objects;

public class Reimbursement_Login {

	private String user_name;
	private String user_password;
	public Reimbursement_Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Reimbursement_Login(String user_name, String user_password) {
		super();
		this.user_name = user_name;
		this.user_password = user_password;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	@Override
	public int hashCode() {
		return Objects.hash(user_name, user_password);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reimbursement_Login other = (Reimbursement_Login) obj;
		return Objects.equals(user_name, other.user_name) && Objects.equals(user_password, other.user_password);
	}
	@Override
	public String toString() {
		return "Reimbursement_Login [user_name=" + user_name + ", user_password=" + user_password + "]";
	}
	
}

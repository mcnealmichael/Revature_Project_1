package com.revature.model;

import java.util.Objects;

public class Employees {

	private String first_name;
	private String last_name;
	private String position_title;
	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employees(String first_name, String last_name, String position_title) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.position_title = position_title;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getPosition_title() {
		return position_title;
	}
	public void setPosition_title(String position_title) {
		this.position_title = position_title;
	}
	@Override
	public int hashCode() {
		return Objects.hash(first_name, last_name, position_title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employees other = (Employees) obj;
		return Objects.equals(first_name, other.first_name) && Objects.equals(last_name, other.last_name)
				&& Objects.equals(position_title, other.position_title);
	}
	@Override
	public String toString() {
		return "Employees [first_name=" + first_name + ", last_name=" + last_name + ", position_title=" + position_title
				+ "]";
	}
	
}

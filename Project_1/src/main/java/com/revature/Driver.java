package com.revature;

import org.eclipse.jetty.http.HttpStatus;

import com.revature.dao.EmployeeDAO;
import com.revature.model.Employees;
import io.javalin.Javalin;

public class Driver {

	public static void main(String[] args) {
		
		Javalin app = Javalin.create().start();
		
		app.get("/login", ctx -> {
			ctx.res().getWriter().write("connection successful! ");
			ctx.res().getWriter().write("Login with a user name or password.  Type register if you need to register.");
		});
		
		
		app.post("/login", ctx -> {
			Employees employee = ctx.bodyAsClass(Employees.class);
			EmployeeDAO empDAO = new EmployeeDAO();
			empDAO.save(employee);
			ctx.status(HttpStatus.CREATED_201);
		});
		
		/*
		EmployeeDAO employeeDAO = new EmployeeDAO();
		Employees emp = new Employees("Dave", "Ramsey", "Finance Manager");
		employeeDAO.save(emp);
		*/
	}
	
}

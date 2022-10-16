package com.revature;

import org.eclipse.jetty.http.HttpStatus;
import com.revature.dao.EmployeeDAO;
import com.revature.dao.LoginDAO;
import com.revature.dao.RegisterDAO;
import com.revature.dao.TicketDAO;
import com.revature.model.Employees;
import com.revature.model.Reimbursement_Login;
import com.revature.model.Reimbursement_Ticket;

import io.javalin.Javalin;

public class Driver {

	public static void main(String[] args) {
		
		Javalin app = Javalin.create().start();
		
		app.get("/login", ctx -> {
			ctx.res().getWriter().write("connection successful! ");
			ctx.res().getWriter().write("Login with a user name or password.  Type register if you need to register.");
		});
		
		
		app.post("/newEmployee", ctx -> {
			Employees employee = ctx.bodyAsClass(Employees.class);
			RegisterDAO register = new RegisterDAO();
			register.save(employee);
			ctx.status(HttpStatus.CREATED_201);
		});
		
		app.post("/verifyUser", ctx -> {
			Reimbursement_Login register = ctx.bodyAsClass(Reimbursement_Login.class);
			LoginDAO userName = new LoginDAO();
			userName.verifyLogin(register);
			ctx.status(HttpStatus.CREATED_201);
		});
		
		app.post("/registerUser", ctx -> {
			
		});
		/*
		app.post("/ticket", ctx -> {
			Reimbursement_Ticket newTicket = ctx.bodyAsClass(Reimbursement_Ticket.class);
			TicketDAO ticket = new TicketDAO();
			ticket.createTicket(newTicket);
			ctx.status(HttpStatus.CREATED_201);
		});
		*/
		/*
		EmployeeDAO employeeDAO = new EmployeeDAO();
		Employees emp = new Employees("John", "Doe", "Employee");
		employeeDAO.save(emp);
		*/
		/*
		LoginDAO userName = new LoginDAO();
		Reimbursement_Login loginUsername = new Reimbursement_Login();
		userName.verifyLogin(loginUsername);
		*/
	}
	
}

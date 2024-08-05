package com.tcs.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.tcs.dao.LoginDAOImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		System.out.println("LoginServlet");
	}

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		// get the data from client
		String uname = req.getParameter("uname");
		String password = req.getParameter("pwd");
		System.out.println(uname + "   " + password);
		pw.println("<html>");
		pw.println("<marquee><h1>Welcome to FlipKart<h1></marquee>");
		LoginDAOImpl loginDAOImpl=new LoginDAOImpl();
		if (loginDAOImpl.isUserExist(uname, password)) {
			pw.println("<h1>Welcome " + uname + "<h1>");
		} else {
			pw.println("<h1>Invlid User<h1> ");
		}
		pw.println("</html>");
		pw.close();
	}

}

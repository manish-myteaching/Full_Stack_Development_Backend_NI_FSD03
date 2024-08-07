package com.tcs.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/first")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FirstServlet() {
		System.out.println("First Servlet");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		// call the second servlet
		RequestDispatcher rd = request.getRequestDispatcher("/second");

		String name = request.getParameter("name");
		PrintWriter pw = response.getWriter();
		pw.println("<h1>First Servlet:" + name + "<h1>");
		// rd.include(request, response);
		// rd.forward(request, response);

		response.sendRedirect("https://www.w3schools.com/");

	}

}

package com.congizant.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WishServlet
 */
public class WishServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 String uname=request.getParameter("uname");
	      PrintWriter pw=response.getWriter();
	      pw.println("<html>");
	      pw.println("<marquee><h1>Welcome to FlipKart<h1></marquee>");
	      Calendar calendar = Calendar.getInstance();
			int hours = calendar.get(calendar.HOUR_OF_DAY);
			if (hours < 12) {
				pw.println("<h1>Good Morning "+uname+"<h1>");
			} else if (hours > 12 && hours < 16) {
				pw.println("<h1>Good After Noon "+uname+"<h1>");
			} else if (hours > 16 && hours < 20) {
				pw.println("<h1>Good Evening "+uname+"<h1>");
			} else {
				pw.println("<h1>Good Night "+uname+"<h1>");
		}
	       pw.println("</html>");
	      pw.close();


	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}

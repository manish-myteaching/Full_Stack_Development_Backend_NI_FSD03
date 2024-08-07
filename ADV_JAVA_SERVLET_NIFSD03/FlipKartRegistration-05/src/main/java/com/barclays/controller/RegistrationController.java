package com.barclays.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.barclays.service.RegistrationService;
import com.barclays.service.RegistrationServiceImpl;
import com.barclays.vo.UserInfoVO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationController
 */

@WebServlet("/register")
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public RegistrationController() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String contactNumber = request.getParameter("contactNumber");
		String cityName = request.getParameter("cityName");
		String gender = request.getParameter("gender");
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		RegistrationService registrationService = RegistrationServiceImpl.getInstance();
		UserInfoVO userInfoVO = new UserInfoVO(firstName, lastName, contactNumber, "M", cityName, userName, password);

		UserInfoVO userInfoVO1 = registrationService.registerUserInfo(userInfoVO);
		if (userInfoVO1 != null) {
			pw.println("<h1>" + userInfoVO1.getFirstName() + " Registerd Successfully" + "<h1>");
		} else {
			pw.println("<h1>" + userInfoVO1.getFirstName() + " is not insert  Sucessfully" + "<h1> ");
		}
	}
}

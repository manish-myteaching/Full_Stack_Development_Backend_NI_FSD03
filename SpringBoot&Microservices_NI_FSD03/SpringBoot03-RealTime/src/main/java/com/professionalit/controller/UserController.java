package com.professionalit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.professionalit.service.UserService;

@Controller("userController")
public class UserController {

	@Autowired
	private UserService UserService;

	public void setUserService(UserService userService) {
		UserService = userService;
	}

	public UserController() {
		System.out.println("UserController object Created...!");
	}

	public void getUserDetail() {
		System.out.println("UserController: getUserDetail..!");
		UserService.getUserDetails();
	}

}

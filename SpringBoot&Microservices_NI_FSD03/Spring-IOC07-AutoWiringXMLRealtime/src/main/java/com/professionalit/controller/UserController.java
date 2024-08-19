package com.professionalit.controller;

import com.professionalit.service.UserService;

public class UserController {

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

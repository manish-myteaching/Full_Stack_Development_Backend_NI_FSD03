package com.professionalit.service;

import com.professionalit.dao.UserDAO;

public class UserServiceImpl implements UserService {

	private UserDAO userDAO;

	public UserServiceImpl() {
		System.out.println("UserServiceImpl object Created...!");
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public void getUserDetails() {
		System.out.println("Service: get user Details..!");
		userDAO.getUserDetails();
	}

}

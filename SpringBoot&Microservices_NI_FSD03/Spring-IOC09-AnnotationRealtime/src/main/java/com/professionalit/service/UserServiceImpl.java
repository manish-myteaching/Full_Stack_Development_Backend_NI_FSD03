package com.professionalit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.professionalit.dao.UserDAO;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	@Qualifier("userOracleImpl")
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

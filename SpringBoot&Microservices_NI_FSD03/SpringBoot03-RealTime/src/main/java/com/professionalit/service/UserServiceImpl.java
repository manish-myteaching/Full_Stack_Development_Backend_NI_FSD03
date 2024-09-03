package com.professionalit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.professionalit.dao.UserDAO;
import com.professionalit.util.PasswordUtil;
import com.professionalit.util.SendMailUtil;
import com.professionalit.util.SendMessageUtil;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	@Qualifier("oracle")
	private UserDAO userDAO;

	@Autowired
	private PasswordUtil passwordUtil;

	@Autowired
	private SendMailUtil sendMailUtil;

	@Autowired
	private SendMessageUtil sendMessageUtil;

	public UserServiceImpl() {
		System.out.println("UserServiceImpl object Created...!");
	}

	@Override
	public void getUserDetails() {
		System.out.println("Service: get user Details..!");
		passwordUtil.passwordEncrypted();
		userDAO.getUserDetails();
		sendMailUtil.sendMessage();
		sendMessageUtil.sendMessage();
	}

}

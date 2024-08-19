package com.professionalit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.professionalit.controller.UserController;

public class IOCTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserController userController = applicationContext.getBean("userController",UserController.class);
		userController.getUserDetail();
	}

}

package com.professionalit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.professionalit.controller.UserController;

public class IOCAutoWiringXMLTest {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContextAutoWiring.xml");
		UserController userController = applicationContext.getBean("userController",UserController.class);
		userController.getUserDetail();
	}

}

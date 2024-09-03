package com.professionalit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.professionalit.controller.UserController;

@SpringBootApplication
public class SpringBoot03RealTimeApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringBoot03RealTimeApplication.class, args);
		UserController userController = applicationContext.getBean("userController", UserController.class);
		userController.getUserDetail();
	}

}

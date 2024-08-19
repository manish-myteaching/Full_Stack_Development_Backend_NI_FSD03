package com.professionalit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.professionalit.bean.Car;
import com.professionalit.config.AppConfig;

public class IOCTest {

	public static void main(String... k) {

		// IOC Container
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		Car car=applicationContext.getBean(Car.class);
		car.drive();
	}

}

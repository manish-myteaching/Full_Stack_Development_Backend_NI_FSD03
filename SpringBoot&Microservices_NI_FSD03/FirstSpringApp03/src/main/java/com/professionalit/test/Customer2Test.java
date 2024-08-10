package com.professionalit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.professionalit.bean.Customer2;

public class Customer2Test {

	public static void main(String[] args) {

		// IOC Container
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/citi/conf/applicationContext.xml");
		Object obj = applicationContext.getBean("customer2");
		Customer2 cutomer2 = (Customer2) obj;
		cutomer2.getCustomerDetails();
	}

}

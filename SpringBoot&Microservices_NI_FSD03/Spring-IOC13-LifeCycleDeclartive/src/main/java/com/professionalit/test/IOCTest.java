package com.professionalit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.professionalit.bean.SpringBeanDemo;

public class IOCTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		SpringBeanDemo sb = applicationContext.getBean(SpringBeanDemo.class);
		sb.show();
		sb.display();
		((ClassPathXmlApplicationContext) applicationContext).close();
	}

}

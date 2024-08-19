package com.professionalit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.professionalit.bean.SpringBeanDemo;
import com.professionalit.config.AppConfig;

public class IOCTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new  AnnotationConfigApplicationContext(AppConfig.class);
		SpringBeanDemo sb = applicationContext.getBean(SpringBeanDemo.class);
		sb.show();
		sb.display();
		((AnnotationConfigApplicationContext) applicationContext).close();
	}

}

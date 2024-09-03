package com.professionalit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.professionalit.bean.DataBaseDAO;

@SpringBootApplication
public class SpringBoot04PropertyConfigApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(SpringBoot04PropertyConfigApplication.class, args);
		DataBaseDAO dba = ac.getBean(DataBaseDAO.class);
		dba.printProperties();
	}

}

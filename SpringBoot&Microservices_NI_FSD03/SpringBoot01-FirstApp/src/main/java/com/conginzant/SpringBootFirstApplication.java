package com.conginzant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SpringBootFirstApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext cx=SpringApplication.run(SpringBootFirstApplication.class, args);	
		System.out.println(cx.getClass().getName());
	}

}

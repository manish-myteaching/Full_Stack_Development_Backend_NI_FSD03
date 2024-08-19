package com.professionalit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.professionalit.bean.SpringBeanDemo;

@Configuration
public class AppConfig {
	
	@Bean
	public SpringBeanDemo getSpringBean() {
		SpringBeanDemo sb=new SpringBeanDemo();
		return sb;
	}


}

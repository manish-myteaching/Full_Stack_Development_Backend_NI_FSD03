package com.professionalit.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.professionalit.service.EmployeeService;

@Component
@Order(4)
@Profile("dev")
public class CacheRunner implements ApplicationRunner {

	@Autowired
	EmployeeService employeeService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("CacheRunner");
		System.out.println(employeeService.findById(1L));
		System.out.println(employeeService.findById(2L));
	}
}

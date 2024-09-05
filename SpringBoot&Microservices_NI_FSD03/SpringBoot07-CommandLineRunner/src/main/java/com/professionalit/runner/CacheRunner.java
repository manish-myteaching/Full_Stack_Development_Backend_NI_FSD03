package com.professionalit.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.professionalit.service.EmployeeService;

@Component
@Order(4)
public class CacheRunner implements CommandLineRunner {

	@Autowired
	EmployeeService employeeService;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("CacheRunner");
		System.out.println(employeeService.findById(1L));
		System.out.println(employeeService.findById(2L));
	}
}

package com.professionalit.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.professionalit.entity.Employee;
import com.professionalit.repository.EmployeeRepository;

@Component
@Order(1)
public class DatabaseInitializerRunner implements ApplicationRunner {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		employeeRepository.save(new Employee(101L, "manish", "Manish@gmail.com"));
		employeeRepository.save(new Employee(102L, "Vijay", "Vijay@gmail.com"));

	}

}

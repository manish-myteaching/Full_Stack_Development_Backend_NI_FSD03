package com.professionalit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.professionalit.entity.Employee;
import com.professionalit.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	public EmployeeRepository employeeRepository;

	@Cacheable(value = "employees", key = "#id")
	public Employee findById(Long id) {
		return employeeRepository.findById(id).orElse(null);
	}

	@CachePut(value = "employees", key = "#employee.id")
	public Employee save(Employee employee) {
		return employeeRepository.save(employee);
	}
}

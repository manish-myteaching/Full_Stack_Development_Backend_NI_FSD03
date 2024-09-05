package com.professionalit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.professionalit.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}

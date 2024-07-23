package com.infosys.dao;

import java.util.List;

import com.tcs.dto.Employee;

public interface EmployeeDAO {

    boolean  createEmployeeDeatail(Employee emp);
    
    boolean  modifyEmployeeDeatail(Employee emp);
    
    boolean deleteEmployeeDeatail(Long empId);
    
    Employee getEmployeeDeatail(Long empId);
    
    List<Employee> getAllEmployeeDeatail();

}

package com.infosys.test;

import com.infosys.dao.EmployeeDAO;
import com.infosys.dao.EmployeeDAOImpl;
import com.tcs.dto.Employee;

public class InsertEmployeeTest {

	public static void main(String[] args) {
		//Business Logic Object----------------------------> Singleton(only one object should be created)
				EmployeeDAO empDAO = new EmployeeDAOImpl();
				
				//Pojo(Information)  -----------> Mulitpal Object
				Employee emp = new Employee();
				emp.setEmpId(113L);
				emp.setEmpName("Sachin");
				emp.setEmpSalary(4545545.00);

				boolean b = empDAO.createEmployeeDeatail(emp);
				
				if (b) {
					System.out.println("Record Insert SuccessFully..!");
				} else {
					System.out.println("Record is not Inserted SuccessFully..!");
				}
			}

	}

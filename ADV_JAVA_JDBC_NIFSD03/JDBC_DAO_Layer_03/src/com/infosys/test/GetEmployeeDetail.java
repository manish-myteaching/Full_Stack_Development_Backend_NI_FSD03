package com.infosys.test;
import com.infosys.dao.EmployeeDAO;
import com.infosys.dao.EmployeeDAOImpl;
import com.tcs.dto.Employee;

public class GetEmployeeDetail {

	public static void main(String[] args) {
		EmployeeDAO empDAO = new EmployeeDAOImpl();
		Employee emp = empDAO.getEmployeeDeatail(101L);

		if (emp != null) {
			System.out.println(emp);
		}else {
			System.out.println("Employee Record is not Found");
		}

	}

}

package com.infosys.test;
import com.infosys.dao.EmployeeDAO;
import com.infosys.dao.EmployeeDAOImpl;

public class DeleteEmpoloyeeTest {

	public static void main(String[] args) {
		//Business Logic Object----------------------------> Singleton(only one object should be created)
				EmployeeDAO empDAO = new EmployeeDAOImpl();
				
				boolean b = empDAO.deleteEmployeeDeatail(113L);
				
				if (b) {
					System.out.println("Record Delete SuccessFully..!");
				} else {
					System.out.println("Record is not Deleted SuccessFully..!");
				}
			}

	}



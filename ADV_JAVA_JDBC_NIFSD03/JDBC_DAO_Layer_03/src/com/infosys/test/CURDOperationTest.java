package com.infosys.test;

import java.util.Random;

import com.infosys.dao.EmployeeDAO;
import com.infosys.dao.EmployeeDAOImpl;
import com.tcs.dto.Employee;
import com.tcs.util.ApplicationUtil;

public class CURDOperationTest {
	static EmployeeDAO empDAO = new EmployeeDAOImpl();
	static Random random = new Random();

	public static void main(String[] args) throws InterruptedException {

//		for(int i=0;i<10;++i) {
//			Thread.sleep(2000);
//			System.out.println(Thread.currentThread().getName()+"=====>  "+i);
//		}

		// Client-1
		Thread insertThread = new Thread(new Runnable() {
			@Override
			public void run() { // public static void main
				while (true) {
					try {
						Thread.sleep(2000);
						// Pojo(Information) -----------> Mulitpal Object
						Employee emp = new Employee();
						emp.setEmpId(new Long(ApplicationUtil.getRandomNumber(100, 110)));
						emp.setEmpName(ApplicationUtil.getEmpString());
						emp.setEmpSalary(new Double(ApplicationUtil.getRandomNumber(20000, 30000)));
						boolean b = empDAO.createEmployeeDeatail(emp);

						if (b) {
							System.out.println("Record Insert SuccessFully..!");
						} else {
							System.out.println("Record is not Inserted SuccessFully..!");
						}

					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});

		// Client-2
		Thread updateThread = new Thread(new Runnable() {
			@Override
			public void run() { // public static void main
				while (true) {
					try {
						Thread.sleep(2000);
						Employee emp = new Employee();
						emp.setEmpId(new Long(ApplicationUtil.getRandomNumber(100, 110)));
						// emp.setEmpName("Sourbh");
						emp.setEmpSalary(2000.00);

						boolean b = empDAO.modifyEmployeeDeatail(emp);

						if (b) {
							System.out.println("Record Update SuccessFully..!");
						} else {
							System.out.println("Record is not Updated SuccessFully..!");
						}

					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
			}
		});

		// Client-3
		Thread deleteThread = new Thread(new Runnable() {
			@Override
			public void run() { // public static void main
				while (true) {
					try {
						Thread.sleep(2000);
						boolean b = empDAO.deleteEmployeeDeatail(new Long(ApplicationUtil.getRandomNumber(100, 110)));
						if (b) {
							System.out.println("Record Delete SuccessFully..!");
						} else {
							System.out.println("Record is not Deleted SuccessFully..!");
						}
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
			}
		});

		//// Client-4
		Thread getEmpThread = new Thread(new Runnable() {
			@Override
			public void run() { // public static void main
				while (true) {
					try {
						Thread.sleep(5000);
						Employee emp = empDAO.getEmployeeDeatail(new Long(ApplicationUtil.getRandomNumber(100, 110)));
						if (emp != null) {
							System.out.println(emp);
						} else {
							System.out.println("Employee Record is not Found");
						}
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
			}
		});

		//// Client-5
		Thread getAllEmpThread = new Thread(new Runnable() {
			@Override
			public void run() { // public static void main
				while (true) {
					try {
						Thread.sleep(2000);
						Employee emp = empDAO.getEmployeeDeatail(101L);

						if (emp != null) {
							System.out.println(emp);
						} else {
							System.out.println("Employee Record is not Found");
						}
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});

		//Asychronous 
		insertThread.start(); 
		updateThread.start();
		deleteThread.start();
		getEmpThread.start();
		getAllEmpThread.start();

	}
}

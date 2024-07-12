package hashcode_equals;

import java.util.Objects;

public class Employee {

	private int empNo;
	private String empName;
	private double empSalary;

	public Employee(int empNo, String empName, double empSalary) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}

	
//	 public int hashCode() {
//			return empNo;
//	 }
//	 
//	 public boolean equals(Employee emp) {
//		 return this.hashCode() == emp.hashCode();
//	 }
	 
	 

}

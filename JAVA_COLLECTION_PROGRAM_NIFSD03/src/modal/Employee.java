package modal;

import java.util.Objects;

import exception.InvalidAmmount;

public class Employee implements Comparable<Employee> {
	private String empName;
	private long empNo;
	private String salary;

	public Employee(long empNo, String empName, String salary) {
		this.empName = empName;
		this.empNo = empNo;
		this.salary = salary;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public long getEmpNo() {
		return empNo;
	}

	public void setEmpNo(long empNo) {
		this.empNo = empNo;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) throws InvalidAmmount {
		float s = Float.parseFloat(salary);
		if (s > 0) {
			this.salary = salary;
		} else {
			throw new InvalidAmmount("Invalid Ammount");
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(empNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empNo == other.empNo;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empNo=" + empNo + ", Salary=" + salary + "]";
	}

	// @Override
	public int compareTo(Employee emp) {
		if (empNo > emp.empNo) {
			return 1;
		} else if (empNo < emp.empNo) {
			return -1;
		}
		return 0;
	}
}

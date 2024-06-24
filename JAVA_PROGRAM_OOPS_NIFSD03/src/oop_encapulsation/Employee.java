package oop_encapulsation;

public class Employee {
	private int empNo;
	private String empName;
	private float salary;
	private int age;

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

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception {
		if (age > 0 && age <= 100) {
			this.age = age;
		} else if (age == 0){
			throw new Exception("Invalid Age");
		} else {
			throw new Exception("Wrong Age is not allowed...Please provide right age");
		}
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", salary=" + salary + ", age=" + age + "]";
	}

	void dispaly() {
	}

}

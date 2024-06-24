package oop_encapulsation;

public class Test {

	public static void main(String[] args) throws Exception {

		Employee emp = new Employee();
		emp.setEmpNo(101);
		emp.setEmpName("Ramesh");
		emp.setSalary(5000);
		emp.setAge(23);
		System.out.println(emp.getEmpName());

		Employee emp1 = new Employee();
		emp1.setEmpNo(102);
		emp1.setEmpName("Ram");
		emp1.setSalary(7000);
		emp1.setAge(6);
		System.out.println(emp1.getEmpName());
	

	}

}

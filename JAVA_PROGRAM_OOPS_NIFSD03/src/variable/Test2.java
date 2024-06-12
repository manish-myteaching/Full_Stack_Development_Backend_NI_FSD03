package variable;

public class Test2 {

	public static void main(String[] args) {
     
		EmployeeDetails.compnayName="TCS";
		
		Address address1 = new Address("Pune", "Maharastra");
		EmployeeDetails employeeDetails1 = new EmployeeDetails(101, "Ramesh", "50000", address1);
		employeeDetails1.getEmployeeDeatails();

		Address address2 = new Address("Indore", "MP");
		EmployeeDetails employeeDetails2 = new EmployeeDetails(102, "Shyam", "60000", address2);
		employeeDetails2.getEmployeeDeatails();

	}

}

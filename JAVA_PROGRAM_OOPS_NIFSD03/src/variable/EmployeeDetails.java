package variable;

public class EmployeeDetails {

	int empNo; // Instance variable
	String empName; // Instance variable
	String empSalary; // Instance variable
	Address address; // Instance variable
	static String compnayName; // class variable

	public EmployeeDetails(int empNo, String empName, String empSalary, Address address) {
		this.empNo = empNo;
		this.empName = empName;
		this.empSalary = empSalary;
		this.address = address;
	}

	void getEmployeeDeatails() {
		String str = "Welcome "; // Local Varible
		System.out.println(str + "" + this.empName);
		System.out.println("Emp No: " + this.empNo);
		System.out.println("Emp Name: " + this.empName);
		System.out.println("Emp empSalary: " + this.empSalary);
		System.out.println("Emp Address City: " + this.address.cityName);
		System.out.println("Emp Address State: " + this.address.stateName);
		System.out.println("Emp CompanyName: " + EmployeeDetails.compnayName);
	}

}

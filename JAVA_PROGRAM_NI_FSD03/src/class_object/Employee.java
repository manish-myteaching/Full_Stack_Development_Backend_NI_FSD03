package class_object;

public class Employee {
   private  int employeeNumber; //primitive   //Instance  variable
     String employeeName; //Reference  //Instance variable
     long employeeSalary; //primitive datatype  //Instance variable
     
     static String companyName ;  // class variable
     
     //Instantiation of object (default information will be created)
     Employee(int employeeNumber,String employeeName,  long employeeSalary){
    	 this.employeeNumber=employeeNumber;
    	 this.employeeName=employeeName;
    	 this.employeeSalary=employeeSalary;
     }
     
     public void getEmployeeDetails() {
    	 System.out.println("Company Name: "+ companyName);
    	 System.out.println("Employee No: "+ this.employeeNumber);
    	 System.out.println("Employee Name: "+ this.employeeName);
    	 System.out.println("Employee Salary: "+ this.employeeSalary); 	 
     }
     
     public static void main(String...k) { // Starting Point //Main Thread
    
    	 Employee.companyName="TCS";
    	 
    	 Employee employee=new Employee(101,"Ramesh",5000);
    	 //employee.employeeName="Ramesh";
    	 //employee.employeeNumber=101;
    	 //employee.employeeSalary=5000;
    	 
    	 
    	 Employee employee2= new Employee(102,"Suresh",7000);
    	// employee2.employeeName="Suresh";
    	 //employee2.employeeNumber=102;
    	 //employee2.employeeSalary=7000;
    	 //employee2.companyName="Infy";
    	 
    	 Employee employee3= new Employee(103,"Suresh",8000);
    	 //employee3.employeeName="Jaydeep";
    	// employee3.employeeNumber=103;
    	 //employee3.employeeSalary=8000;
    	 //employee3.companyName="cognizant";
    	 
    	 
    	employee.getEmployeeDetails();
    	employee.getEmployeeDetails();
        employee.getEmployeeDetails();
        
    	    
     }
     
}

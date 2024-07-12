package set;

import java.util.HashSet;
import java.util.Set;

import modal.Employee;

public class EmployeeSetDemo {

	public static void main(String[] args) {
		Employee emp1 = new Employee(101, "Ram", "50000");
		Employee emp2 = new Employee(102, "Shyam", "60000");
		Employee emp3 = new Employee(103, "Rmesh", "80000");
		Employee emp4 = new Employee(104, "Virat", "90000");
		Employee emp5 = new Employee(105, "Sachine", "40000");
		Employee emp6 = new Employee(106, "Shirkant", "80000");
		Employee emp7 = new Employee(106, "Shirkant", "80000");
		Employee emp8 = new Employee(106, "Shirkant", "80000");
		Employee emp9 = new Employee(106, "Shirkant", "80000");
		

		Set<Employee> setEmp = new HashSet<Employee>();
		setEmp.add(emp1);
		setEmp.add(emp2);
		setEmp.add(emp3);
		setEmp.add(emp4);
		setEmp.add(emp5);
		setEmp.add(emp6);
		setEmp.add(emp7);
		setEmp.add(emp8);
		setEmp.add(emp9);

		// Traverse
		for (Employee emp : setEmp) {
			System.out.println(emp);
			System.out.println(emp.hashCode());
		}

	}

}

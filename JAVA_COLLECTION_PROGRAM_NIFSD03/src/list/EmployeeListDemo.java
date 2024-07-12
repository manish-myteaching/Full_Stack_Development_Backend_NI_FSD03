package list;

import java.util.ArrayList;
import java.util.List;

import modal.Employee;

public class EmployeeListDemo {

	public static void main(String[] args) {
		Employee emp1 = new Employee(101, "Ram", "50000");
		Employee emp2 = new Employee(102, "Shyam", "60000");
		Employee emp3 = new Employee(103, "Rmesh", "80000");
		Employee emp4 = new Employee(104, "Virat", "90000");
		Employee emp5 = new Employee(105, "Sachine", "40000");
		Employee emp6 = new Employee(106, "Shirkant", "80000");

		List<Employee> list = new ArrayList<Employee>();
		// insert
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);

		System.out.println(list);

		list.add(2, emp6);

		// Traverse
		for (Employee emp : list) {
			System.out.println(emp);
		}

		// delete
		list.remove(2);

		Employee emp = list.get(4);
		System.out.println(emp);

	}

}

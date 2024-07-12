package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import modal.Employee;

public class ListEmployeeDemo {

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

		List<Employee> list = new ArrayList<Employee>();
		list.add(emp1);
		list.add(emp5);
		list.add(emp6);
		list.add(emp7);
		list.add(emp8);
		list.add(emp9);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);

		for (Employee emp : list) {
			System.out.println(emp);
		}

		System.out.println("");
		System.out.println("");

		// Collections.sort(list);
	   System.out.println("Enter input for sotring: ");
		Scanner obj = new Scanner(System.in);
		String sortBy = obj.next();
     
		if ("EN".equals(sortBy)) {
			Collections.sort(list, new EmpNameComparator());
		} else if ("ENO".equals(sortBy)) {
			Collections.sort(list, new EmpNoComparator());
		} else if ("ESAL".equals(sortBy)) {
			Collections.sort(list, new EmpsalaryComparator());
		} else {
			Collections.sort(list);
		}

		for (Employee emp : list) {
			System.out.println(emp);
		}

	}

}

package sorting;

import java.util.Comparator;

import modal.Employee;


public class EmpsalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getSalary().compareTo(o2.getSalary());
	}

}

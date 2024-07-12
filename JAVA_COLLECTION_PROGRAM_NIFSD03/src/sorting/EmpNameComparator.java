package sorting;

import java.util.Comparator;

import modal.Employee;

public class EmpNameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEmpName().compareTo(o2.getEmpName());
	}

}

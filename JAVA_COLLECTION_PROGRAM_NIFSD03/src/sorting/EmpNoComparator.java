package sorting;

import java.util.Comparator;

import modal.Employee;

public class EmpNoComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.getEmpNo() > o2.getEmpNo()) {
			return 1;
		} else if (o1.getEmpNo() < o2.getEmpNo()) {
			return -1;
		}
		return 0;
	}

}

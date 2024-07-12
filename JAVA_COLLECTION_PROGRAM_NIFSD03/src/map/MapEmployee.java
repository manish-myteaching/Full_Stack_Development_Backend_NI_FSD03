package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import modal.Employee;

public class MapEmployee {

	public static void main(String[] args) {
		Employee emp1 = new Employee(101, "Ram", "50000");
		Employee emp2 = new Employee(102, "Shyam", "60000");
		Employee emp3 = new Employee(103, "Rmesh", "80000");
		Employee emp4 = new Employee(104, "Virat", "90000");
		Employee emp5 = new Employee(105, "Sachine", "40000");
		Employee emp6 = new Employee(106, "Shirkant", "80000");
		Employee emp7 = new Employee(106, "Shirkant", "80000");
		Employee emp8 = new Employee(106, "Shirkant", "80000");
		Employee emp9 = new Employee(106, "Shirkant", "40000");

		Map<Employee, String> map = new HashMap<Employee, String>();
		map.put(emp1, emp1.getEmpName());
		map.put(emp2, emp2.getEmpName());
		map.put(emp3, emp3.getEmpName());
		map.put(emp4, emp4.getEmpName());
		map.put(emp5, emp5.getEmpName());
		map.put(emp6, emp6.getEmpName());
		map.put(emp7, emp7.getEmpName());
		map.put(emp8, emp8.getEmpName());
		map.put(emp9, emp9.getEmpName());
		// System.out.println(map);

		String s = map.get(emp1);
		System.out.println(s);

		// Traverse
		Set<Map.Entry<Employee, String>> set = map.entrySet();

		for (Map.Entry me : set) {
			System.out.println(me.getKey() + " " + me.getValue());
		}

	}

}

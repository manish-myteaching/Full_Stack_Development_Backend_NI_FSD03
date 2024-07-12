package hashcode_equals;

public class Test {

	public static void main(String[] args) {
		Employee emp = new Employee(101, "A", 3000.0);
		// System.out.println(emp.hashCode());

		Employee emp2 = new Employee(101, "A", 3000.0);
		// System.out.println(emp2.hashCode());

		String s = new String("India");
		// System.out.println(s);

		int i = 10;
		int j = 20;
		//System.out.println(i == j);
		System.out.println(emp.equals(emp2));

	}

}

package constructor;

public class Test {

	public static void main(String[] args) {

		ConstructorDemo cd = new ConstructorDemo(10, "abc", new Student(101, "Ram"));
		System.out.println(cd.toString());
		ConstructorDemo cd1 = new ConstructorDemo(11, "aa", new Student(102, "Ankit"));
		System.out.println(cd1.toString());
		ConstructorDemo cd2 = new ConstructorDemo(12, "dd", new Student(103, "Ramesh"));
		System.out.println(cd2.toString());
		ConstructorDemo cd3 = new ConstructorDemo(13, "ee", new Student(104, "Suresh"));
		System.out.println(cd3.toString());
		ConstructorDemo cd4 = new ConstructorDemo(14, "ee", new Student(105, "Shyam"));
		System.out.println(cd4.toString());

	}

}

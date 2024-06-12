package variable;

public class LocalVariableRefDemo {

	LocalVariableRefDemo() {
		String s = new String("Welcome To India");
		int a[] = new int[5];
		Student student = new Student();
		System.out.println(s.hashCode());
		System.out.println(a.hashCode());
		System.out.println(student.hashCode());
	}

	public static void main(String[] args) {

		String s = new String("Welcome To India");
		int a[] = new int[5];
		Student student = new Student();

		System.out.println(s.hashCode());
		System.out.println(a.hashCode());
		System.out.println(student.hashCode());

	}

}

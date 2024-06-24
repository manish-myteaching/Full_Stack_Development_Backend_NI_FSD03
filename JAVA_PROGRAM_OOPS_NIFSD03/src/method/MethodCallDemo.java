package method;

public class MethodCallDemo {

	void show() {
		System.out.println("Instance Method");
	}

	void test() {
		show();
		print();
	}

	static void print() {
		System.out.println("Class  Method");
	}

	public static void main(String... k) {
		// Instance Method call(2-way)
		new MethodCallDemo().show();

		MethodCallDemo mcd = new MethodCallDemo();
		mcd.show();

		// Class Method call(4-way)
		new MethodCallDemo().print(); // Not recommended
		mcd.print(); // Not recommended

		MethodCallDemo.print(); // recommended
		print();// recommended

	}

}

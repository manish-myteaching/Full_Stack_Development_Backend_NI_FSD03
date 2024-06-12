package method;

public class MethodDemo {

	int add(int a, int b) {
		int c = a + b; // Business Logic
		return c;
	}

	int multiplication(int a, int b) {
		int c = a * b; // Business Logic
		return c;
	}

	public static void main(String... k) {
		MethodDemo md = new MethodDemo();
		int result = md.add(10, 20);
		System.out.println(result);

	}

}

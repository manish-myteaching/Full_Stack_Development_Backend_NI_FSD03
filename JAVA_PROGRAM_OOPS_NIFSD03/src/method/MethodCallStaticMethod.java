package method;

public class MethodCallStaticMethod {

	static void show() {
		System.out.println("show");
	}

	static void print() {
		// this.show(); //Not allowed non-static content
		show();
		System.out.println("print");
	}

	public static void main(String[] args) {
		// MethodCallStaticMethod.show();
		// MethodCallStaticMethod.print();

		show();
		print();

	}

}

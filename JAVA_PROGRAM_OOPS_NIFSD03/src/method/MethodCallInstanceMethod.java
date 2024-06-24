package method;

public class MethodCallInstanceMethod {

	void show() {
		System.out.println("show");
	}

	void print() {
		System.out.println("print");
		this.show();
	}

	public static void main(String[] args) {

		MethodCallInstanceMethod ob = new MethodCallInstanceMethod();
		ob.show();
		ob.print();

	}

}

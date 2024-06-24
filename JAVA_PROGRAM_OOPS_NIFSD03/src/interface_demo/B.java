package interface_demo;

public class B implements A {

	@Override
	public void show() {
		System.out.println("show method");
	}

	public void print() {
		System.out.println("print method ");
	}

	public static void main(String... k) {

		System.out.println(A.x);
		B b = new B();
		b.show();
		b.print();

		A a = new B();
		a.show();

	}

}

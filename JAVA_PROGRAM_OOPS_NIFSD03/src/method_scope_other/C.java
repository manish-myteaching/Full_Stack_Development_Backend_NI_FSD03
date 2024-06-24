package method_scope_other;

import method_scope.A;

public class C extends A {

	public void test() {
		this.display(); //inhteritance
		this.print();
	}

	public static void main(String... k) {
		A a = new A();
		a.print();
	}

}

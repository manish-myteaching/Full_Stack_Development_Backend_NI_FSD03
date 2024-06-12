package variable_scope_other;

import variable_scope.A;

public class E {

	A a = new A();
	
	void show() {
         System.out.println(a.i);
         System.out.println(A.j);
	}

}

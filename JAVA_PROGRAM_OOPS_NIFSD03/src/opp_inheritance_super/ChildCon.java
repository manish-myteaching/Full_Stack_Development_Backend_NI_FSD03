package opp_inheritance_super;

public class ChildCon extends ParentCon {

	ChildCon() {
		super(10); // Implicitly
		System.out.println("Child-constructor");
	}

	ChildCon(int x) {
		// super(10);
		this();
		System.out.println("Child-constructor " + x);
	}

}

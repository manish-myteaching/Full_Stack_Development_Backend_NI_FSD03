package oop_inhertiance_super_this_constructor;

public class B extends A {

	B() {
		System.out.println("Adv Java");
	}

	B(String s) {
		this();
		System.out.println(s);
	}

}

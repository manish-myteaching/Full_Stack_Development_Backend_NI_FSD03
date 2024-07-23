package oop_ploymorphism_method_overridding;

public class Parent {

	void show() {
		System.out.println("parent-show");
	}

	void show(String s) {
		System.out.println("parent-show " + s);
	}
	
	static void display() {
		System.out.println("parent display");
	}

}

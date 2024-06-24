package opp_inheritance_super;

public class Child extends Parent {

	int x = 20;
	
	Child(){
		System.out.println(this.x);
	}

	void show() {
		System.out.println(x); // same class level
		System.out.println(this.x); // same class level
		System.out.println(super.x);// Parent class level
	}

}

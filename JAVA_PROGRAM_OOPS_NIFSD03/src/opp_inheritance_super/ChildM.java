package opp_inheritance_super;

public class ChildM extends ParentM {

	public void show() {
		System.out.println("Child-Show");
	}

	public void display() {
		show(); // same class method
		this.show(); // same class method
		super.show(); // Parent class will be call
	}

}

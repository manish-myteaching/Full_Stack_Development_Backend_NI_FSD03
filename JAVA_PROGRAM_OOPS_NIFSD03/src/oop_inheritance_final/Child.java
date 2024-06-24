package oop_inheritance_final;

public class Child extends Parent {

	//void show() {   // Not allowed because it is final
		//System.out.println("Child-show");
	//}

	public void display() {
		// this.x = 20; // Not allowed because it is final
		System.out.println(this.x);
	}

}

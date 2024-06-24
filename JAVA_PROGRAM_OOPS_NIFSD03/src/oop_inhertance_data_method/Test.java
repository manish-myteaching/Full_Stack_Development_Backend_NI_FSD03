package oop_inhertance_data_method;

public class Test {

	public static void main(String[] args) {
		// Parent or subclass
		Parent parent = new Parent();
		System.out.println(parent.x);
		parent.show();

		// Child or subclass
		Child child = new Child();
		System.out.println(child.x);
		child.show();
		System.out.println(child.y);
		child.print();

		//Parent class reference and object will be child class
		Parent parent1 = new Child();
		System.out.println(parent.x);
		parent1.show();

	}

}

package oop_polymorphism_dynamic_binding;

public class Test implements Demo {

	@Override
	public void show() {
		System.out.println("show");

	}

	@Override
	public void display() {
		System.out.println("display");

	}

	@Override
	public void print() {

		System.out.println("print");
	}

	@Override
	public void print(int i) {

		System.out.println("print " + i);
	}

	@Override
	public void print(String s) {
		System.out.println("print " + s);

	}
	
	
	public static void main(String...k) {
		 Demo demo=new Test();
		 demo.show();
		 demo.display();
		 demo.print();
		 demo.print("Hello");
		 
		 
		
	}

}

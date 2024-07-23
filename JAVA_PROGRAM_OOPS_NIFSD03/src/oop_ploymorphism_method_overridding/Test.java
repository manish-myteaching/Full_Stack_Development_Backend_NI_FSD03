package oop_ploymorphism_method_overridding;

public class Test {

	public static void main(String... k) {
		
		Child child=new Child();
		child.show();
		
		Parent parent= new Child(); // Run time polymorphism // Upcasting
		parent.show();	
		parent.display();
		

	}

}

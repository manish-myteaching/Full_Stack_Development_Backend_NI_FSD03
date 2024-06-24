package oop_ploymorphims_upcasting_downcasting;

public class Test {

	public static void main(String[] args) {
      
		Parent parent=new Child(); // Upcasting
		parent.show();
			
		Child child2 = new Child();
		Parent parent2=child2; // Upcasting
		parent2.show();
		
		
		Child child=(Child)parent; // Downcasting
		child.show();
		child.print();
		

	}

}

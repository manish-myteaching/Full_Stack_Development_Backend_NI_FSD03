package oop_polymorphism_dynamic_binding;

public class Maruti implements Car {

	@Override
	public void gear() {
		System.out.println("gear - Maruti");
		
	}

	@Override
	public void speed() {
		System.out.println("speed - Maruti");
		
	}

}

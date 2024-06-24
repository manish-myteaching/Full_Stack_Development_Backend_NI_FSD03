package oop_polymorphism_dynamic_binding;

public class BMW implements Car {

	@Override
	public void gear() {
		System.out.println("gear - BMW");
		System.out.println("5- gear");
		
	}

	@Override
	public void speed() {
		System.out.println("speed - BMW");
		System.out.println("Max speed - 150 Km/h");
		
	}

}

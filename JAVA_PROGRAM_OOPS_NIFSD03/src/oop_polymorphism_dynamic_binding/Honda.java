package oop_polymorphism_dynamic_binding;

public class Honda implements Car {

	@Override
	public void gear() {
		System.out.println("gear - Honda");

	}

	@Override
	public void speed() {
		System.out.println("speed - Honda");
		System.out.println("Max Speed: "+ "120 Km/h");

	}

}

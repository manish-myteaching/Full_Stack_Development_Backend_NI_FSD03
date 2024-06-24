package oop_polymorphism_dynamic_binding;

public class MG implements Car {

	@Override
	public void gear() {
		System.out.println("MG - gear");
		
	}

	@Override
	public void speed() {
		System.out.println("MG - speed");
		
	}

}

package com.professionalit.buiness;

public class Car {
	Engine engine;

	public static Car INSTANCE = null;

	private Car() {

	}

	// Constructor
	private Car(Engine engine) {
		this.engine = engine;
	}

	public static Car getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Car();
		}
		return INSTANCE;
	}

	// Setter
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void drive() {
		int status = engine.start();
		if (status >= 1) {
			System.out.println("Journy Start");
		} else {
			System.out.println("Engine is not working");
		}
	}

}

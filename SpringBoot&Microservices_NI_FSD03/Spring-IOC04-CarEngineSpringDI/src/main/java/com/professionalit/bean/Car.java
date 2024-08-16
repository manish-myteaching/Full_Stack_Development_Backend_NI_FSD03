package com.professionalit.bean;

public class Car {
	Engine engine;

	// Constructor
	public Car() {
		System.out.println("Car Object Created");
	}

	public Car(Engine engine) {
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

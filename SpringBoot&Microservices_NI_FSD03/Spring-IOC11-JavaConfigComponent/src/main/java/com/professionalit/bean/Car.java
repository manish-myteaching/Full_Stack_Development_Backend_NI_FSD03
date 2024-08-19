package com.professionalit.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	@Autowired
	@Qualifier("dieselEngine")
	private Engine engine;

	public Car() {
		System.out.println("Car Object Created");
	}
	
	public Car(Engine engin) {
		System.out.println("Car Object Created");
		this.engine=engin;
	}
	
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

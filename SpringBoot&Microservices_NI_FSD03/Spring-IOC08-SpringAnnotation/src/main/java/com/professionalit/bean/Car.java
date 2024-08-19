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
//
//	@Autowired
//	public Car(@Qualifier("dieselEngine")Engine engine) {
//		this.engine = engine;
//	}
	
	
//	@Autowired
//	@Qualifier("petrolEngine")
//	public void setEngine(Engine engine) {
//		this.engine = engine;
//	}

	public void drive() {
		int status = engine.start();
		if (status >= 1) {
			System.out.println("Journy Start");
		} else {
			System.out.println("Engine is not working");
		}
	}

}

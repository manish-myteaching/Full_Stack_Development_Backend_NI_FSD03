package com.professionalit.factory;

import com.professionalit.buiness.Car;
import com.professionalit.buiness.DieselEngine;
import com.professionalit.buiness.PetrolEngine;

public class CarFactory {

	// Logic for factory
	public static Car getCar(String engine) {
		Car car = Car.getInstance(); // Singleton
		if ("P".equalsIgnoreCase(engine)) {
			car.setEngine(new PetrolEngine()); // DI
		} else if ("D".equalsIgnoreCase(engine)) {
			car.setEngine(new DieselEngine()); // DI
		}
		return car;
	}

}

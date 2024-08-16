package com.professionalit.test;

import com.professionalit.buiness.Car;
import com.professionalit.factory.CarFactory;

public class FactoryTest {

	public static void main(String[] args) {
		Car car = CarFactory.getCar("D");
		car.drive();
		System.out.println(car.hashCode());
		
		Car car1 = CarFactory.getCar("P");
		car.drive();
		System.out.println(car1.hashCode());
	}

}

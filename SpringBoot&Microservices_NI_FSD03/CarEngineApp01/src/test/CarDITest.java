package test;

import startgydesignpattern.CarDI;
import startgydesignpattern.DieselEngine;
import startgydesignpattern.Engine;
import startgydesignpattern.PetrolEngine;

public class CarDITest {

	public static void main(String[] args) {
			Engine engine = new DieselEngine();
			CarDI car = new CarDI(engine);	
			car.drive();
			
			Engine engine2 = new PetrolEngine();
			CarDI car2 = new CarDI(engine2);	
			car2.drive();
		}
	

}

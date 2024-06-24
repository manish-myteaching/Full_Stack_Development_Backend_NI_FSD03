package oop_polymorphism_dynamic_binding;

public class CarInformation {

	//Factory Method
   Car getCarDetails(String str) {
		Car car = null;
		if ("BMW".equals(str)) {
			car = new BMW();
		}
		if ("Honda".equals(str)) {
			car = new Honda();
		}
		if ("Maruti".equals(str)) {
			car = new Maruti();
		}

		if ("MG".equals(str)) {
			car = new MG();
		}
		return car;
	}

	public static void main(String[] args) {
		CarInformation carInfo = new CarInformation();
		Car car = carInfo.getCarDetails("Honda");
		car.gear();
		car.speed();

	}

}

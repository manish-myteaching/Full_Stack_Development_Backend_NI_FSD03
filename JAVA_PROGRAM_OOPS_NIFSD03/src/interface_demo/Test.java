package interface_demo;

public class Test {

	public static void main(String[] args) {
		Car car = new Honda();
		System.out.println(car.gear());
		car.speed();

		Car car2 = new Maruti();
		System.out.println(car2.gear());
		car2.speed();

		Car car3 = new BMW();
		System.out.println(car3.gear());
		car3.speed();

	}

}

package interface_demo;

public class BMW implements Car {

	@Override
	public int gear() {
		return 5;
	}

	@Override
	public void speed() {
		System.out.println("Max speed 160 Km/h");
		
	}

}

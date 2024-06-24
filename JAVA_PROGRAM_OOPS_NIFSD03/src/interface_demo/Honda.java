package interface_demo;

public class Honda implements Car {

	@Override
	public int gear() {
		return 4;
	}

	@Override
	public void speed() {
		System.out.println("Max speed 140 Km/h");
	}

}

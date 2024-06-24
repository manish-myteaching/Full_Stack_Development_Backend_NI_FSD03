package interface_demo;

public class Maruti implements Car {

	@Override
	public int gear() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public void speed() {
		System.out.println("Max speed 120 Km/h");

	}

}

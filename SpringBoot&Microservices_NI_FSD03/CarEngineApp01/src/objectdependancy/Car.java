package objectdependancy;

public class Car extends Engine {
	public void drive() {
		int status = super.start();
		if (status >= 1) {
			System.out.println("Journy Start");
		} else {
			System.out.println("Engine is not working");
		}
	}
}

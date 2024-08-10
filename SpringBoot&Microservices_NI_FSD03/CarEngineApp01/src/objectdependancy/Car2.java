package objectdependancy;


public class Car2 {
	Engine engine = new Engine(); //HAS-A
	public void driver() {
		int status = engine.start();
		if (status >= 1) {
			System.out.println("Journy Start");
		} else {
			System.out.println("Engine is not working");
		}
	}

}

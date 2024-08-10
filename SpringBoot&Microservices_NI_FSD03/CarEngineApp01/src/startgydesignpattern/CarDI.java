package startgydesignpattern;

public class CarDI {
	Engine engine; 

	// Constructor
	public CarDI() {
		this.engine = engine;
	}
	
	public CarDI(Engine engine) {
		this.engine = engine;
	}

	// Setter
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void drive() {
		int status = engine.start();
		if (status >= 1) {
			System.out.println("Journy Start");
		} else {
			System.out.println("Engine is not working");
		}
	}

}

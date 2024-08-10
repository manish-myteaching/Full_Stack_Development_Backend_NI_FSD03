package startgydesignpattern;

public class DieselEngine implements Engine {

	@Override
	public int start() {
		System.out.println("Deseal Engine");
		return 1;
	}

}

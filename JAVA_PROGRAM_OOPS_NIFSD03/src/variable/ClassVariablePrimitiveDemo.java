package variable;

public class ClassVariablePrimitiveDemo {

	static int i;
	// class variable
	// Loading Time(.class will be loaded into JVM)
	// One Time Memory Will be created
	// Method Area

	public void show() {
		System.out.println(i);
	}

	public void display() {
		System.out.println(i);
	}

	public static void print() {
		System.out.println(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

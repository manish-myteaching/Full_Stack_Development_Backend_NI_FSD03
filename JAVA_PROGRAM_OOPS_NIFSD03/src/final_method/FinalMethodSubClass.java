package final_method;

public class FinalMethodSubClass extends FinalMethodDemo {

	/*
	 * public void show() { System.out.println("show-child"); }
	 */

	public void display() {
		this.show();
	}

	public static void main(String... k) {
		FinalMethodSubClass fm = new FinalMethodSubClass();
		fm.show();
	}

}

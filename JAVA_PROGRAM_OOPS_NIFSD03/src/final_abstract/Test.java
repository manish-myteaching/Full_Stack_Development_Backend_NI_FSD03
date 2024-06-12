package final_abstract;

public class Test {

	public static void main(String... k) {
		SubClass demo = new SubClass();
		demo.m();
		demo.show();

		AbstractClass ac = new SubClass();
		ac.m();
		ac.show();

		FinalClass fc = new FinalClass();
		fc.show();
	}

}

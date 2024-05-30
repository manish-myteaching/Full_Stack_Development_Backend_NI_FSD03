package iterativeforloop;

public class NestedForLoopDemo {

	public static void main(String... k) {
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; i <= j; j++) {
				System.out.println("i=> "+i + "\t" + "j=> "+j);
			}
		}
	}

}

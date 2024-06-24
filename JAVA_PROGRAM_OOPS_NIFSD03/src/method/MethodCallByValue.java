package method;

public class MethodCallByValue {
	int x = 23;
	int y = 45;

	void swap(int a, int b) {
		int c = a;
		a = b;
		b = c;
		System.out.println(a + "\t" + b);
	}

	public static void main(String... k) {
		MethodCallByValue mcbr = new MethodCallByValue();
		mcbr.swap(mcbr.x, mcbr.y);
		System.out.println(mcbr.x + "\t" + mcbr.y);
	}

}

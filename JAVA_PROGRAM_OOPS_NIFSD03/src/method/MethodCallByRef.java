package method;

public class MethodCallByRef {

	int x = 23;
	int y = 45;

	void swap(MethodCallByRef mcbv) {
		int c = mcbv.x;
		mcbv.x = mcbv.y;
		mcbv.y = c;
	}

	public static void main(String... k) {
		MethodCallByRef mcbr = new MethodCallByRef();
		mcbr.swap(mcbr);
		System.out.println(mcbr.x + "\t" + mcbr.y);
	}

}

package method;

public class MethodDemoWR4 {

	void swap(int a, int b) {
		int c = a;
		a = b;
		b = c;
		System.out.println(a + "\t" + b);
	}

	public static void main(String[] args) {
		MethodDemoWR4 md = new MethodDemoWR4();
		int x = 23;
		int y = 45;
		md.swap(x, y);
		System.out.println(x + "\t" + y);

	}

}

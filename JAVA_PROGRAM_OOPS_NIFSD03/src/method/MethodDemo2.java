package method;

public class MethodDemo2 {

	int[] print(int a[]) {
		for (int i = 0; i < a.length; i++) {
			a[i] = a[i] + 5;
		}
		return a;
	}

	public static void main(String... k) {
		MethodDemo2 md = new MethodDemo2();
		int a[] = { 10, 34, 50, 32 };
		int b[] = md.print(a);
		for (int e : b) {
			System.out.println(e);
		}

	}

}

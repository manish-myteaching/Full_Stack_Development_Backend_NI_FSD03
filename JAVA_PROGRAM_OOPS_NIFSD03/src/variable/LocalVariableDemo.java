package variable;

public class LocalVariableDemo {

	LocalVariableDemo() {
		int i = 20;
		System.out.println(10 + i);
	}

	{
		int i = 20;
		System.out.println(10 + i);
	}

	static {
		int i = 20;
		System.out.println(10 + i);
	}

	void m() {
		int i = 20;
		System.out.println(i);
	}

	public static void main(String[] args) {
		final int i = 10; // Stack Area or Stack Frame
		int j = 20;
		int k = 30;

		j = 48;
		k = 89;

		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	}

}

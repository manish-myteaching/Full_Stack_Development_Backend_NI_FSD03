package iterativewhileloop;

public class WhileLoopDemo4 {

	public static void main(String[] args) {
		int a = 5, b = 3, c = 2;
		while ((a >= ++b) || (a > c)) {
			c = c + b;
		}
		System.out.println(a + "\t" + b + "\t" + c);
	}

}

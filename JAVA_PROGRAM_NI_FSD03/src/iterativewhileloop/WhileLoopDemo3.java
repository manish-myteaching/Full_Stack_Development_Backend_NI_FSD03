package iterativewhileloop;

public class WhileLoopDemo3 {

	public static void main(String[] args) {
		int a = 5, b = 3, c = 0;
		while ((a >= ++b) || (a >= ++b)) {
			c = c + b;         
		}
        System.out.println(a + "\t" +b+ "\t"+c);
	}

}

package operators;

public class AithmaticOperators {

	public static void main(String[] args) {
		int a=5;
		int b=3;
		int c=a+b;
		int d=a-b;
		int e=a*b;
		int f=a/b;
		int g=a%b;
		
		a-=b;   //a=a-b;
		System.out.println("Unary: "+a);
		System.out.println("Add: "+c);
		System.out.println("Sub: "+d);
		System.out.println("Multiplication: "+e);
		System.out.println("Division: "+f);
		System.out.println("Modulo: "+g);

	}

}

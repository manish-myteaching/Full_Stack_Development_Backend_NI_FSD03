package method_scope;

public class B extends A {
	
	public void test()
	{
		this.display();
		this.print();
	}
	

	public static void main(String... k) {
		
		B a=new B();
		a.display();
		a.print();

	}

}

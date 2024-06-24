package method_scope;

public class A {

	private   void show() {
		System.out.println("show");
	}

	public  void print() {
		this.show();
		System.out.println("print");
	}

	protected void display() {
		System.out.println("display");
	}

}

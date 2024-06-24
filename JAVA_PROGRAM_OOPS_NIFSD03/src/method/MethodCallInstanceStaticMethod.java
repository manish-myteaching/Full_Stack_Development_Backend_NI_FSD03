package method;

public class MethodCallInstanceStaticMethod {

	 public void show() {
		print();
		System.out.println("show");
	}

	static public void print() {
		// show();//Not allowed
		System.out.println("print");
	}

	public static void main(String[] args) {
		MethodCallInstanceStaticMethod obj = new MethodCallInstanceStaticMethod();
		obj.show();

		print();

	}

}

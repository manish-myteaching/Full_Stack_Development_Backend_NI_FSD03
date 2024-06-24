package abstract_method;

public class AbstractDemoSubClass extends AbstractMethodDemo {

	@Override
	void show() {
		System.out.println("show");
	}

	public static void main(String[] args) {
		AbstractDemoSubClass ad = new AbstractDemoSubClass();
		ad.show();
		
		AbstractMethodDemo adsc=new AbstractDemoSubClass();
		adsc.show();
	}

}

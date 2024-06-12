package this_keyword;

public class Demo {

	int i = 10;
	String s = "pune";

	Demo(int cityNo, String city) {
		this.i = cityNo;
		this.s = city;
	}

	public void show() {
		System.out.println(this.i);
		System.out.println(this.s);
	}

	public static void main(String[] args) {
		Demo demo = new Demo(101, "Pune");
		demo.show();

		Demo demo2 = new Demo(102, "Mumbai");
		demo2.show();

		Demo demo3 = new Demo(103, "Hyd");
		demo3.show();

	}

}

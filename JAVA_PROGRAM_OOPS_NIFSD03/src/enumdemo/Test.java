package enumdemo;

public class Test {

	public static void main(String[] args) {
		Day d = Day.FRI;
		System.out.println(d);

		for (Day day : Day.values()) {
			System.out.println(day);
		}

		for (Day day2 : Day.values()) {
			System.out.println(day2 + "=" + day2.get());
		}

	}

}

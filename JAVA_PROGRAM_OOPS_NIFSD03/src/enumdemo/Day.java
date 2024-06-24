package enumdemo;

public enum Day {
	MON(1), TUE(2), WED(3), THU(4), FRI(5), SAT(6), SUN(7);

	int x;

	Day(int x) {
		this.x = x;
	}

	int get() {
		return x;
	}
}

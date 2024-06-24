package oop_polymorphism_method_overloadding;

public class Demo {

	int max(int a, int b) {
		if (a > b)
			return a;
		else
			return b;
	}

	float max(int a, float b) {
		if (a > b)
			return a;
		else
			return b;
	}

	int max(int a, int b, int c) {
		if ((a > b) && (a > c)) {
			return a;
		} else if (b > c) {
			return b;
		} else {
			return c;
		}
	}

}

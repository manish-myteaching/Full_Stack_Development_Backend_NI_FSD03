package singleton;

import java.io.Serializable;

public class Singleton implements Cloneable, Serializable {

	public static Singleton INSTANCE = null;

	private Singleton() {

	}

	public synchronized static Singleton getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Singleton();
			return INSTANCE;
		}
		return INSTANCE;
	}

	public void show() {
		System.out.println("show");
	}

	public int add(int a, int b) { // Business Logic
		return a + b;
	}

	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Clone is not supported");
	}

}

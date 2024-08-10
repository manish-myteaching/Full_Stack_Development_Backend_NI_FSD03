package singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import thread.ThreadCreate;

public class Test {

	public static void main(String... k) { // Main

		// Singleton singleton = new Singleton(); // Main
		Singleton singleton = Singleton.getInstance();
		System.out.println(singleton.hashCode());
		System.out.println(singleton.add(77, 14));

		Singleton singleton4;
		try {
			singleton4 = (Singleton) singleton.clone(); // Riskey Code
			System.out.println("Clone Object: " + singleton4.hashCode());
		} catch (CloneNotSupportedException e) {
			System.out.println(e.getMessage());
		}

		// Singleton singleton2 = new Singleton();// Main
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton2.hashCode());
		System.out.println(singleton2.add(10, 14));

		ThreadCreate treadCreate = new ThreadCreate(); // New Thread
		treadCreate.start();

		Runnable r = new Runnable() { // New Thread
			@Override
			public void run() {
				// Singleton singleton = new Singleton();
				Singleton singleton = Singleton.getInstance();
				System.out.println(singleton.hashCode());
				System.out.println(singleton.add(66, 14));
			}
		};

		Thread treadCreate3 = new Thread(r);
		treadCreate3.start();

		// Reflation API
		Constructor<Singleton> constructor = null;
		try {
			constructor = Singleton.class.getDeclaredConstructor();
			constructor.setAccessible(true);
			Singleton instanceTwo = constructor.newInstance();
			System.out.println("Rflaction API: " + instanceTwo.hashCode());
		} catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException
				| IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

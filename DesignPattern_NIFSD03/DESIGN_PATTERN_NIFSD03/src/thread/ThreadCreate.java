package thread;

import singleton.Singleton;

public class ThreadCreate extends Thread {

	public void run() {
		//Singleton singleton = new Singleton();
		Singleton singleton =  Singleton.getInstance();
		System.out.println(singleton.hashCode());
		System.out.println(singleton.add(20, 14));
	}

}

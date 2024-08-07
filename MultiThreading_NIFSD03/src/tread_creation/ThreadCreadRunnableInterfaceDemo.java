package tread_creation;

public class ThreadCreadRunnableInterfaceDemo implements Runnable {

	@Override
	public void run() { // public static void main

		for (int i = 0; i <= 10; ++i) {
			try {
				Thread.sleep(5000);
				System.out.println("Thread Created " + i + " =====>" + Thread.currentThread().getName());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Thread Created " + Thread.currentThread().getName());
		ThreadCreadRunnableInterfaceDemo tcri = new ThreadCreadRunnableInterfaceDemo();
		Thread thread = new Thread(tcri);

		ThreadCreadRunnableInterfaceDemo tcri2 = new ThreadCreadRunnableInterfaceDemo();
		Thread thread2 = new Thread(tcri2);
		
		ThreadCreadRunnableInterfaceDemo tcri3 = new ThreadCreadRunnableInterfaceDemo();
		Thread thread3 = new Thread(tcri3);

		
		ThreadCreadRunnableInterfaceDemo tcri4 = new ThreadCreadRunnableInterfaceDemo();
		Thread thread4 = new Thread(tcri4);

		
		ThreadCreadRunnableInterfaceDemo tcri5 = new ThreadCreadRunnableInterfaceDemo();
		Thread thread5 = new Thread(tcri5);


		thread.start();
		Thread.sleep(1000);
		thread2.start();
		Thread.sleep(1000);
		thread3.start();
		Thread.sleep(1000);
		thread4.start();
		Thread.sleep(1000);
		thread5.start();
	}

}

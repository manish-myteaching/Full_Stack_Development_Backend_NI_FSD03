package tread_creation;

public class ThreadCreationThreadClassDemo extends Thread{
 
	 public void run() {

			for (int i = 0; i <= 10; ++i) {
				try {
					Thread.sleep(5000);
					System.out.println("Thread Created " + i + " =====>" + Thread.currentThread().getName());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
	 }
	
	public static void main(String[] args) {
	 
		ThreadCreationThreadClassDemo tctd=new ThreadCreationThreadClassDemo();
		tctd.start();
		
		ThreadCreationThreadClassDemo tctd2=new ThreadCreationThreadClassDemo();
		tctd2.start();

	}

}

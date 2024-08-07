package tread_creation;

public class ThreadPrintExcel implements Runnable {

	@Override
	public void run() {
		System.out.println("Print Excel in Progress....");
		// Logic for Print Excel
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Print Excel End....");
	}

}

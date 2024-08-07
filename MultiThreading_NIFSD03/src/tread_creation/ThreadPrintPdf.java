package tread_creation;

public class ThreadPrintPdf implements Runnable {

	@Override
	public void run() {
		System.out.println("Print Pdf in Progress...");
		//Logic for pdf writing 
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Print Pdf End");

	}

}

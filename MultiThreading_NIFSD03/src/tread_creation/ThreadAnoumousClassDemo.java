package tread_creation;

public class ThreadAnoumousClassDemo {

	public static void main(String[] args) {
		// Thread - pdf
		Thread threadPdfCreation = new Thread(new ThreadPrintPdf());
		threadPdfCreation.start();
		// Thread - excel
		Thread threadexcelCreation = new Thread(new ThreadPrintExcel());
		threadexcelCreation.start();

		
		// Thread - database
		Thread threadDatabaseCreation = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Insertion Database in Progress....");
				// Logic for Print Excel
				try {
					Thread.sleep(60000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Insertion in Database End");
			}
		});	
		threadDatabaseCreation.start();

		
		
		// Thread - Mail
		Thread threadMailCreation = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Mailing in Progress....");
				// Logic for Print Excel
				try {
					Thread.sleep(50000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				System.out.println("Mailing End");

			}
		});
		threadMailCreation.start();
	}

}

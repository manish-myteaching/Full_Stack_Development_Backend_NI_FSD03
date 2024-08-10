
public class PaymentTest {

	public static void main(String[] args) {

		// Payment by Debit Card
		Payment debitCard = new DebitCardImpl();
		PaymentService paymentService = new PaymentService(debitCard); //Constructor Injection
		paymentService.processPayment(5000);

		// Payment by Credit Card
		Payment creditPayment = new CreditCardImpl();
		PaymentService paymentService2 = new PaymentService(creditPayment); // Constructor Injection
		paymentService2.processPayment(8000.00);

		// Payment by UPI
		Payment upiPayment = new UPIImpl();
		PaymentService paymentService3 = new PaymentService(); //Setter injeaction
		paymentService3.setPayment(upiPayment);
		paymentService3.processPayment(7000);

	}
}


public class PaymentService {
	private Payment payment;
	
	public PaymentService(){
	
	}

	public PaymentService(Payment Payment) {
		this.payment = Payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	boolean processPayment(double billAmmount) {
		int status = payment.doPayment(billAmmount);
		if (status >= 1) {
			return true;
		}
		return false;
	}

}

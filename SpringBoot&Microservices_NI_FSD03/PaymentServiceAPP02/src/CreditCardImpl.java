
public class CreditCardImpl implements Payment {

	@Override
	public int doPayment(double billAmmount) {
		System.out.println("Ammount: "+billAmmount +" Payment Done by Credit Card..!");
		return 1;
	}

}

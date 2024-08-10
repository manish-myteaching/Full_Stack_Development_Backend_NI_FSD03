
public class DebitCardImpl implements Payment {

	@Override
	public int doPayment(double billAmmount) {

		System.out.println("Ammount: "+billAmmount +"Payment done Debit Card..!");
		return 1;

	}

}

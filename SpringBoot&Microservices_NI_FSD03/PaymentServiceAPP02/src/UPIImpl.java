
public class UPIImpl implements Payment {

	@Override
	public int doPayment(double billAmmount) {
		System.out.println("Ammount: "+billAmmount+"Payment Done By UPI..!");
		return 1;
	}

}

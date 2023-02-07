package callbackPattern;

public class PaymentGateway implements Callback {

	PaymentMethod pm; 
	
	public PaymentGateway(PaymentMethod pm) {
		this.pm = pm;
	}
	
	
	public PaymentMethod getPm() {
		return pm;
	}


	@Override
	public void paymentSuccess() {
		System.out.println(this.getPm().toString() + " payment has been made correctly");
	}

	public void executePayment() {
		try {
			pm.executePayment();
			paymentSuccess();
		} catch (Exception e) {
			System.out.println("Something went wrong.");
		}
	}

}

package callbackPattern;

public class CreditCard extends PaymentMethod {
	
	private double shoesPrice;
	
	public CreditCard(double shoesPrice) {
		this.shoesPrice = shoesPrice;
	}

	public double getShoesPrice() {
		return shoesPrice;
	}

	@Override
	public void executePayment() {
		logger.info(this.getShoesPrice() + " € are being charged...");
		
		try {
			 Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public String toString() {
		return "Credit card";
	}
	
}

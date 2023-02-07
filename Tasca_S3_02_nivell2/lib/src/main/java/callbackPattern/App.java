package callbackPattern;

public class App {

	public static void main(String[] args) {
		
		//Dins del tipus de pagament introduim el preu del que costen les sabates
		PaymentGateway pg1 = new PaymentGateway(new CreditCard(69.25));
		pg1.executePayment();

		PaymentGateway pg2 = new PaymentGateway(new PayPal(125.99));
		pg2.executePayment();
		
		PaymentGateway pg3 = new PaymentGateway(new BankAccountDebit(83.50));
		pg3.executePayment();
		
		
	}

}

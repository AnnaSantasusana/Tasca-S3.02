package callbackPattern;

import java.util.logging.Logger;

public abstract class PaymentMethod {

    Logger logger = Logger.getLogger(PaymentMethod.class.getName());    // Create a Logger
	
	public abstract void executePayment();
	
}

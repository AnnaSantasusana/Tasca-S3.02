package dependecyInjectionPattern;

public class App {

	public static void main(String[] args) {
		
		CurrencyConverter cc1 = new CurrencyConverter(new Table());
		cc1.converter();
		
		CurrencyConverter cc2 = new CurrencyConverter(new Chair());
		cc2.converter();
	}

}

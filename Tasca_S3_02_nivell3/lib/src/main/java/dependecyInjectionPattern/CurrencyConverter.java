package dependecyInjectionPattern;

public class CurrencyConverter {

	private Items item;
	
	public CurrencyConverter(Items item) {
		this.item = item;
	}
	
	public void converter() {
		float dolares = (float) (item.getPrice() * 1.07);
		float libras = (float) (item.getPrice() * 0.89);
		
		System.out.println("Item: " + item.getName() + "\nPreu de l'artice:\n" + item.getPrice() + " €\n" 
					+ dolares + " $\n" + libras + " £");
	}
}

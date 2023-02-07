package dependecyInjectionPattern;

public class Table implements Items {

	private String name = "Rustic wood color table, with black crossed legs";
	private float tablePrice = 209.95f;
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public float getPrice() {
		return tablePrice;
	}

}

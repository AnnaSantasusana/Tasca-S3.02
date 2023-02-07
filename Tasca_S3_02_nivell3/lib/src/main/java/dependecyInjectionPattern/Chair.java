package dependecyInjectionPattern;

public class Chair implements Items {

	private String name = "Grey dining chair with black legs";
	private float chairPrice = 37.75f;
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public float getPrice() {
		return chairPrice;
	}

}

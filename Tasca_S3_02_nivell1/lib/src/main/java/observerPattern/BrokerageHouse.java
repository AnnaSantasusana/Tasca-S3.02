package observerPattern;

//Observer
public abstract class BrokerageHouse {

	protected StockBroker stockBroker;
	public abstract void updateRise();
	public abstract void updateFall();
	
}

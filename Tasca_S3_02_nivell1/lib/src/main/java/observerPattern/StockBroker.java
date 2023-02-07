package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class StockBroker {

	private List<BrokerageHouse> brokerageHouses = new ArrayList<BrokerageHouse>();
	private double stockMarketChange; //porcentaje de incremento o decremento de la borsa
	
	public void setStockMarketChange(double stockMarketChange) {
		this.stockMarketChange = stockMarketChange;
		
		if (this.stockMarketChange > 0) {
			notifyObserversRise();
		} else if (this.stockMarketChange < 0) {
			notifyObserversFall();
		} else {
			System.out.println("The stock market remains unchanged");
		}
	}
	
	public double getStockMarketChange() {
		return this.stockMarketChange;
	}

	public void addBrokerageHouse(BrokerageHouse brockerageHouse) {
		brokerageHouses.add(brockerageHouse);
	}
	
	public void removeBrokerageHouse(BrokerageHouse brockerageHouse) {
		brokerageHouses.remove(brockerageHouse);
	}
	
	public void notifyObserversRise() {
		brokerageHouses.forEach(x -> x.updateRise());
	}
	
	public void notifyObserversFall() {
		brokerageHouses.forEach(x -> x.updateFall());
	}
}

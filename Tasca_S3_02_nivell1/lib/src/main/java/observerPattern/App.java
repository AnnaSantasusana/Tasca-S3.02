package observerPattern;

public class App {

	public static void main(String[] args) {
		
		StockBroker stockBroker = new StockBroker();
		
		new BrokerageHouse1(stockBroker);
		new BrokerageHouse2(stockBroker);
		new BrokerageHouse3(stockBroker);
		
		
		//Dia 1. La borsa puja l'1.49%
		stockBroker.setStockMarketChange(+1.49);
		
		//Dia 2. La borsa baixa el 3.25%
		stockBroker.setStockMarketChange(-3.25);
		
		//Dia 3. La borsa baixa el 2.15%
		stockBroker.setStockMarketChange(-2.15);
		
	}

}

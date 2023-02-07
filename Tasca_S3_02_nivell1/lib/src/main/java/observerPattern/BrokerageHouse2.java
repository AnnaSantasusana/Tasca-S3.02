package observerPattern;

import java.text.NumberFormat;

public class BrokerageHouse2 extends BrokerageHouse {

	private double stockMarket = 34053.94;
	
	public BrokerageHouse2(StockBroker stockBroker) {
		this.stockBroker = stockBroker;
		this.stockBroker.addBrokerageHouse(this);
	}
	
	public String newStockMarket() {
		double percentChange = this.stockMarket * (stockBroker.getStockMarketChange() / 100);
		double currentStockMarket = this.stockMarket + percentChange;
		this.stockMarket = currentStockMarket;
		
		NumberFormat nf= NumberFormat.getInstance();
        nf.setMaximumFractionDigits(2);
		
		return nf.format(currentStockMarket);
	}
	
	@Override
	public void updateRise() {
		System.out.println("The stock market has rised. BrokerageHouse 2 current stock market: " + newStockMarket());
	}

	@Override
	public void updateFall() {
		System.out.println("The stock market has falled. BrokerageHouse 2 current stock market: " + newStockMarket());
	}

}

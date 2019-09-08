package behavioralPatterns._02_Strategy.rebateStrategy.priceCalculator;

import behavioralPatterns._02_Strategy.rebateStrategy.priceCalculator.pricingStrategy.PricingStrategy;

public class PriceCalculator {
    String produkt;
    private PricingStrategy pricingStrategy;

    public PriceCalculator(String produkt) {
        this.produkt = produkt;
    }

    public void calculate(int price, boolean isSignedUpForNewsletter){
        this.pricingStrategy.calculatePrice(price, isSignedUpForNewsletter);
    }

    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public String getProdukt() {
        return produkt;
    }

    public void setProdukt(String produkt) {
        this.produkt = produkt;
    }

}

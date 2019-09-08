package behavioralPatterns._02_Strategy.rebateStrategy.priceCalculator.pricingStrategy;

public interface PricingStrategy {
    void calculatePrice(int price, boolean isSignedUpForNewsletter);
}

package behavioralPatterns._02_Strategy.rebateStrategy.priceCalculator.pricingStrategy;

public class SalePrice implements PricingStrategy {
    public void calculatePrice(int price, boolean isSignedUpForNewsletter) {
        if (isSignedUpForNewsletter==true){
            System.out.println("Cena produktu podlega Rabatowi 50% = " +price/2);
        }else {
            System.out.println("Cena nie podlega Rabatowi (zła metoda)");
        }
    }
}

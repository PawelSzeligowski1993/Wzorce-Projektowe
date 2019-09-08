package behavioralPatterns._02_Strategy.rebateStrategy.priceCalculator.pricingStrategy;

public class RegularPrice implements PricingStrategy {
    public void calculatePrice(int price, boolean isSignedUpForNewsletter) {
     if (isSignedUpForNewsletter==false){
         System.out.println("Brak rabatu na dany produkt, cena = " +price);
     }else {
         System.out.println("Cena regularna nie obowiązuje (zła metoda)");
     }
    }
}

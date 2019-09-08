package behavioralPatterns._02_Strategy.rebateStrategy;

import behavioralPatterns._02_Strategy.rebateStrategy.priceCalculator.PriceCalculator;
import behavioralPatterns._02_Strategy.rebateStrategy.priceCalculator.pricingStrategy.RegularPrice;
import behavioralPatterns._02_Strategy.rebateStrategy.priceCalculator.pricingStrategy.SalePrice;

public class Main {
    public static void main(String[] args) {
        PriceCalculator priceCalculator = new PriceCalculator("Spodnie"); //Spodnie 100


        // Zapisanie użytkownika do newslettera - zniżka
        priceCalculator.setPricingStrategy(new SalePrice());
        priceCalculator.calculate(100,true);

        // Zapisanie użytkownika do newslettera - błędna strategia
        priceCalculator.setPricingStrategy(new SalePrice());
        priceCalculator.calculate(100, false);

        //Zapisanie użytkownika do newslettera - brak zniżki
        priceCalculator.setPricingStrategy(new RegularPrice());
        priceCalculator.calculate(120, true);

        //Zapisanie użytkownika do newslettera - błędna strategia
        priceCalculator.setPricingStrategy(new RegularPrice());
        priceCalculator.calculate(120, false);
    }
}

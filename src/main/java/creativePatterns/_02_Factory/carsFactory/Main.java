package creativePatterns._02_Factory.carsFactory;

import creativePatterns._02_Factory.carsFactory.factory.CommonwealthFactory;
import creativePatterns._02_Factory.carsFactory.factory.ContinentalFactory;
import creativePatterns._02_Factory.carsFactory.factory.cars.Car;
import creativePatterns._02_Factory.carsFactory.factory.cars.CarsModel;
import creativePatterns._02_Factory.carsFactory.factory.Factory;

public class Main {
    public static void main(String[] args) {
        Factory commonwealthFactory = new CommonwealthFactory();
        Factory continentalFactory = new ContinentalFactory();

        System.out.println("Right Standard");
        Car Polonez = commonwealthFactory.createPolonez(CarsModel.CARO);
        System.out.println(Polonez);

        Car BMW_E60 = commonwealthFactory.createBMW(CarsModel.E60);
        System.out.println(BMW_E60);

        Car BMW_X5 = commonwealthFactory.createBMW(CarsModel.X5);
        System.out.println(BMW_X5);

        Car Ford_CMax = commonwealthFactory.createFord(CarsModel.CMax);
        System.out.println(Ford_CMax);

        Car Ford_Focus = commonwealthFactory.createFord(CarsModel.Focus);
        System.out.println(Ford_Focus);

        Car Opel_Astra_K = commonwealthFactory.createOpel(CarsModel.ASTRA_K);
        System.out.println(Opel_Astra_K);

        Car Opel_Astra_J = commonwealthFactory.createOpel(CarsModel.ASTRA_J);
        System.out.println(Opel_Astra_J);

        Car Opel_Insygnia = commonwealthFactory.createOpel(CarsModel.INSYGNIA);
        System.out.println(Opel_Insygnia);

        System.out.println("\n\nLeft Standard");
        Car Polonez1 = continentalFactory.createPolonez(CarsModel.CARO);
        System.out.println(Polonez1);

        Car BMW_E601 = continentalFactory.createBMW(CarsModel.E60);
        System.out.println(BMW_E601);

        Car BMW_X51 = continentalFactory.createBMW(CarsModel.X5);
        System.out.println(BMW_X51);

        Car Ford_CMax1 = continentalFactory.createFord(CarsModel.CMax);
        System.out.println(Ford_CMax1);

        Car Ford_Focus1 = continentalFactory.createFord(CarsModel.Focus);
        System.out.println(Ford_Focus1);

        Car Opel_Astra_K1 = continentalFactory.createOpel(CarsModel.ASTRA_K);
        System.out.println(Opel_Astra_K1);

        Car Opel_Astra_J1 = continentalFactory.createOpel(CarsModel.ASTRA_J);
        System.out.println(Opel_Astra_J1);

        Car Opel_Insygnia1 = continentalFactory.createOpel(CarsModel.INSYGNIA);
        System.out.println(Opel_Insygnia1);
    }

}

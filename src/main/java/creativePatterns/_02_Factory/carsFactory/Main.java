package creativePatterns._02_Factory.carsFactory;

import creativePatterns._02_Factory.carsFactory.factory.Car;
import creativePatterns._02_Factory.carsFactory.factory.CarsFactory;
import creativePatterns._02_Factory.carsFactory.factory.CarsModel;
import creativePatterns._02_Factory.carsFactory.factory.Factory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new CarsFactory();

        Car Polonez = factory.createCar(CarsModel.CARO);
        System.out.println(Polonez);

        Car BMW_E60 = factory.createCar(CarsModel.E60);
        System.out.println(BMW_E60);

        Car BMW_X5 = factory.createCar(CarsModel.X5);
        System.out.println(BMW_X5);

        Car Ford_CMax = factory.createCar(CarsModel.CMax);
        System.out.println(Ford_CMax);

        Car Ford_Focus = factory.createCar(CarsModel.Focus);
        System.out.println(Ford_Focus);

        Car Opel_Astra_K = factory.createCar(CarsModel.ASTRA_K);
        System.out.println(Opel_Astra_K);

        Car Opel_Astra_J = factory.createCar(CarsModel.ASTRA_J);
        System.out.println(Opel_Astra_J);

        Car Opel_Insygnia = factory.createCar(CarsModel.INSYGNIA);
        System.out.println(Opel_Insygnia);
    }
}

package creativePatterns._02_Factory.carsFactory.factory.cars;

public class Ford extends Car {

    public Ford(String brand, CarsModel model, int capacityEngine, String fuel, int yearOfProduction, SteeringWheelPosition position) {
        super(brand, model, capacityEngine, fuel, yearOfProduction, position);
    }
}

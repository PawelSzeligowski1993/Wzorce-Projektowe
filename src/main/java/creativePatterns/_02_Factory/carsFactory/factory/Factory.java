package creativePatterns._02_Factory.carsFactory.factory;

import creativePatterns._02_Factory.carsFactory.factory.cars.Car;
import creativePatterns._02_Factory.carsFactory.factory.cars.CarsModel;

public abstract class Factory {
    abstract public Car createBMW(CarsModel model);
    abstract public Car createOpel(CarsModel model);
    abstract public Car createFord(CarsModel model);
    abstract public Car createPolonez(CarsModel model);
}

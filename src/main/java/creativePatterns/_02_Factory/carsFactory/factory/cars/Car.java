package creativePatterns._02_Factory.carsFactory.factory.cars;

public abstract class Car {
    private String brand;
    private CarsModel model;
    private int capacityEngine;
    private String fuel;
    private int yearOfProduction;
    private SteeringWheelPosition position;

    protected Car(String brand, CarsModel model, int capacityEngine, String fuel, int yearOfProduction, SteeringWheelPosition position){
        this.brand = brand;
        this.model = model;
        this.capacityEngine = capacityEngine;
        this.fuel = fuel;
        this.yearOfProduction = yearOfProduction;
        this.position = position;
    }

    public String getBrand() {
        return brand;
    }
    public CarsModel getModel() {
        return model;
    }
    public int getCapacityEngine() {
        return capacityEngine;
    }
    public String getFuel() {
        return fuel;
    }
    public int getYearOfProduction() {
        return yearOfProduction;
    }
    public SteeringWheelPosition getposition() { return position; }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model=" + model +
                ", capacityEngine=" + capacityEngine +
                ", fuel='" + fuel + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", steeringWheelPosition=" + position +
                '}';
    }
}

package creativePatterns._02_Factory.carsFactory.factory;

public abstract class Car {
    private String brand;
    private String model;
    private int capacityEngine;
    private String fuel;
    private int yearOfProduction;

    protected Car(String brand, String model, int capacityEngine, String fuel, int yearOfProduction){
        this.brand = brand;
        this.model = model;
        this.capacityEngine = capacityEngine;
        this.fuel = fuel;
        this.yearOfProduction = yearOfProduction;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
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

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", capacityEngine=" + capacityEngine +
                ", fuel='" + fuel + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}

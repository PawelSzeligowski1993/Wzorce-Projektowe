package creativePatterns._02_Factory.carsFactory.factory;

import creativePatterns._02_Factory.carsFactory.factory.cars.*;

public class ContinentalFactory extends Factory {
    public Car createBMW(CarsModel model) {
        switch (model) {
            case X5:
                return new BMW("BMW", CarsModel.X5, 2993, "Diesel", 2019, SteeringWheelPosition.LEFT);
            case E60:
                return new BMW("BMW", CarsModel.E60, 2993, "Diesel", 2011, SteeringWheelPosition.LEFT);
            default:
                throw new UnsupportedOperationException("No such type");
        }
    }

    public Car createFord(CarsModel model) {
        switch (model){
            case CMax:
                return new Ford("Ford", CarsModel.CMax,2000,"Petrol",2011, SteeringWheelPosition.LEFT);
            case Focus:
                return new Ford("Ford", CarsModel.Focus,1600,"Diesel", 2010, SteeringWheelPosition.LEFT);
            default:
                throw new UnsupportedOperationException("No such type");
        }
    }

    public Car createOpel(CarsModel model) {
        switch (model){
            case ASTRA_J:
                return new Opel("Opel", CarsModel.ASTRA_J,2000,"Petrol",2011, SteeringWheelPosition.LEFT);
            case ASTRA_K:
                return new Opel("Opel", CarsModel.ASTRA_K,2100,"Petrol",2013, SteeringWheelPosition.LEFT);
            case INSYGNIA:
                return new Opel("Opel", CarsModel.INSYGNIA,2500, "Diesel", 2014, SteeringWheelPosition.LEFT);
            default:
                throw new UnsupportedOperationException("No such type");
        }
    }

    public Car createPolonez(CarsModel model) {
        switch (model){
            case CARO:
                return new Polonez("Polonez", CarsModel.CARO,1600,"Petrol",1999, SteeringWheelPosition.LEFT);
            default:
                throw new UnsupportedOperationException("No such type");
        }
    }
}

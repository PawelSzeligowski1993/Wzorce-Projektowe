package creativePatterns._02_Factory.carsFactory.factory;

public class CarsFactory extends Factory {
    public Car createCar(CarsModel model) {
        switch (model){
            /*BMW FACTORY*/
            case X5:
                return new BMW("BMW", "X5",2993, "Diesel",2019);
            case E60:
                return new BMW("BMW", "E60",2993,"Diesel",2011);
            /*FORD FACTORY*/
            case CMax:
                return new Ford("Ford", "CMax",2000,"Petrol",2011);
            case Focus:
                return new Ford("Ford", "Focus",1600,"Diesel", 2010);
            /*OPEL FACTORY*/
            case ASTRA_J:
                return new Opel("Opel", "Astra J",2000,"Petrol",2011);
            case ASTRA_K:
                return new Opel("Opel", "Astra K",2100,"Petrol",2013);
            case INSYGNIA:
                return new Opel("Opel", "Insygnia",2500, "Diesel", 2014);
            /*POLONEZ FACTORY*/
            case CARO:
                return new Polonez("Polonez", "Caro",1600,"Petrol",1999);
            default:
                throw new UnsupportedOperationException("No such type");
        }
    }
}

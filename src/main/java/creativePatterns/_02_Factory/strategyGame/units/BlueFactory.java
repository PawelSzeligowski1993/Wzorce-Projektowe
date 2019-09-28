package creativePatterns._02_Factory.strategyGame.units;

public class BlueFactory extends Factory {
    public InfantryUnit createInfantryUnit(UnitType type) {
        switch (type){
            case RIFLEMAN:
                return new Rifleman(25, 0, 5);
            default:
                throw new UnsupportedOperationException("Nieznany typ");
        }
    }

    public MechanizedUnit createMechanizedUnit(UnitType type) {
        switch (type){
            case TANK:
                return new Tank(100, 0, 25);
        default:
            throw new UnsupportedOperationException("Nieznany typ");
        }
    }

    public AirUnit createAirUnit(UnitType type) {
        switch (type) {
            case Helicopter:
                return new Helicopter(55, 0, 45);
            default:
                throw new UnsupportedOperationException("Nieznany typ");
        }
    }

}

package creativePatterns._02_Factory.strategyGame.units;

public class RedFactory extends Factory {
    public InfantryUnit createInfantryUnit(UnitType type) {
        switch (type) {
            case RIFLEMAN:
                return new Rifleman(20, 0, 6);
            default:
                throw new UnsupportedOperationException("Nieznany typ");
        }
    }

    public MechanizedUnit createMechanizedUnit(UnitType type) {
        switch (type) {
            case TANK:
                return new Tank(75, 0, 35);
            default:
                throw new UnsupportedOperationException("Nieznany typ");
        }
    }

    public AirUnit createAirUnit(UnitType type) {
        switch (type) {
            case Helicopter:
                return new Helicopter(45, 0, 55);
            default:
                throw new UnsupportedOperationException("Nieznany typ");
        }
    }


}

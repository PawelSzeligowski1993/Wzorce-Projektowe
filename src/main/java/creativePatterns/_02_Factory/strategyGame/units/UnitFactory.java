package creativePatterns._02_Factory.strategyGame.units;

public class UnitFactory extends Factory {

    @Override
    public Unit createUnit(UnitType unitType) {

        switch (unitType){
            case TANK:
                return new Tank(200, 0, 20);
            case RIFLEMAN:
                return new Rifleman(100, 0, 10);
            default:
                throw new UnsupportedOperationException("No such type");
        }
    }
}

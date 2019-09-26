package creativePatterns._02_Factory.strategyGame;

import creativePatterns._02_Factory.strategyGame.units.Factory;
import creativePatterns._02_Factory.strategyGame.units.Unit;
import creativePatterns._02_Factory.strategyGame.units.UnitFactory;
import creativePatterns._02_Factory.strategyGame.units.UnitType;

public class Main {
    public static void main(String[] args) {

        Factory factory = new UnitFactory();

        Unit tank = factory.createUnit(UnitType.TANK);
        Unit infantryman = factory.createUnit(UnitType.RIFLEMAN);

    }
}

package creativePatterns._02_Factory.strategyGame;

import creativePatterns._02_Factory.strategyGame.units.*;

public class Main {
    public static void main(String[] args) {

        Factory blufactory = new BlueFactory();
        Factory redFactory = new RedFactory();

        MechanizedUnit redTank = redFactory.createMechanizedUnit(UnitType.TANK);
        InfantryUnit redInfantry = redFactory.createInfantryUnit(UnitType.RIFLEMAN);
        AirUnit redHelicopter = redFactory.createAirUnit(UnitType.Helicopter);

        MechanizedUnit blueTank = blufactory.createMechanizedUnit(UnitType.TANK);
        InfantryUnit blueInfantry = blufactory.createInfantryUnit(UnitType.RIFLEMAN);
        AirUnit blueHelicopter = blufactory.createAirUnit(UnitType.Helicopter);
    }
}

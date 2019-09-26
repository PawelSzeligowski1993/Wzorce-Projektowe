package creativePatterns._02_Factory.strategyGame.units;

abstract public class Factory {
    abstract public Unit createUnit(UnitType type);
}

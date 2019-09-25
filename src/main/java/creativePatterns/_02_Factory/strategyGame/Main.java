package creativePatterns._02_Factory.strategyGame;

public class Main {
    public static void main(String[] args) {
        Unit tank = new Tank(200, 0, 20);
        Unit infantryman = new Rifleman(20, 0, 10);
    }
}

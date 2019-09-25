package creativePatterns._01_Builder.hause.builderClassic;

public class SmallHouseBuilder implements HouseBuilder {
    private HouseClassic houseClassic;

    public SmallHouseBuilder() {
        this.houseClassic = new HouseClassic();
    }

    public void buildWalls() {
        this.houseClassic.setWalls("small walls");
    }
    public void buildFloors() {
        this.houseClassic.setFloors("small floors");
    }
    public void buildRooms() {
        this.houseClassic.setRooms("small rooms");
    }
    public void buildRoof() {
        this.houseClassic.setRoof("small roof");
    }
    public void buildWindows() {
        this.houseClassic.setWindows("small windows");
    }
    public void buildDoors() {
        this.houseClassic.setDoors("small doors");
    }
    public void buildGarage() { }

    public HouseClassic getHouseClassic() {
        return houseClassic;
    }
}

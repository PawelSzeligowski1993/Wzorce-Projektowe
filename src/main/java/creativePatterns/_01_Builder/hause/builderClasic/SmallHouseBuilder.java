package creativePatterns._01_Builder.hause.builderClasic;

public class SmallHouseBuilder implements HouseBuilder {
    private HouseClasic houseClasic;

    public SmallHouseBuilder() {
        this.houseClasic = new HouseClasic();
    }

    public void buildWalls() {
        this.houseClasic.setWalls("small walls");
    }
    public void buildFloors() {
        this.houseClasic.setFloors("small floors");
    }
    public void buildRooms() {
        this.houseClasic.setRooms("small rooms");
    }
    public void buildRoof() {
        this.houseClasic.setRoof("small roof");
    }
    public void buildWindows() {
        this.houseClasic.setWindows("small windows");
    }
    public void buildDoors() {
        this.houseClasic.setDoors("small doors");
    }
    public void buildGarage() { }

    public HouseClasic getHouseClasic() {
        return houseClasic;
    }
}

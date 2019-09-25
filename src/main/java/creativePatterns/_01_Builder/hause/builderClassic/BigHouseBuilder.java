package creativePatterns._01_Builder.hause.builderClassic;

public class BigHouseBuilder implements HouseBuilder {

    private HouseClassic houseClassic;
    public BigHouseBuilder(){
        this.houseClassic = new HouseClassic();
    }

    public void buildWalls() {
        this.houseClassic.setWalls("big walls");
    }

    public void buildFloors() {
        this.houseClassic.setFloors("big floors");
    }

    public void buildRooms() {
        this.houseClassic.setRooms("big rooms");
    }

    public void buildRoof() {
        this.houseClassic.setRoof("big roof");
    }

    public void buildWindows() {
        this.houseClassic.setWindows("big windows");
    }

    public void buildDoors() {
        this.houseClassic.setDoors("big doors");
    }

    public void buildGarage() {
        this.houseClassic.setGarage("big Garage");
    }

    public HouseClassic getHouseClassic() {
        return houseClassic;
    }
}

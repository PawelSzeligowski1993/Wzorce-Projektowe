package creativePatterns._01_Builder.hause.builderClasic;

public class BigHouseBuilder implements HouseBuilder {

    private HouseClasic houseClasic;
    public BigHouseBuilder(){
        this.houseClasic = new HouseClasic();
    }

    public void buildWalls() {
        this.houseClasic.setWalls("big walls");
    }

    public void buildFloors() {
        this.houseClasic.setFloors("big floors");
    }

    public void buildRooms() {
        this.houseClasic.setRooms("big rooms");
    }

    public void buildRoof() {
        this.houseClasic.setRoof("big roof");
    }

    public void buildWindows() {
        this.houseClasic.setWindows("big windows");
    }

    public void buildDoors() {
        this.houseClasic.setDoors("big doors");
    }

    public void buildGarage() {
        this.houseClasic.setGarage("big Garage");
    }

    public HouseClasic getHouseClasic() {
        return houseClasic;
    }
}

package creativePatterns._01_Builder.hause.builderClasic;

public class HouseDirector {
    private HouseBuilder houseBuilder;

    public HouseDirector(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }

    public void buildHouse(){
        houseBuilder.buildWalls();
        houseBuilder.buildFloors();
        houseBuilder.buildRooms();
        houseBuilder.buildRoof();
        houseBuilder.buildWindows();
        houseBuilder.buildDoors();
        houseBuilder.buildGarage();
    }

    public HouseClasic getHouseClasic(){
        return this.houseBuilder.getHouseClasic();
    }
}

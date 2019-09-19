package creativePatterns._01_Builder.hause.builderClasic;

public interface HouseBuilder {
    void buildWalls();
    void buildFloors();
    void buildRooms();
    void buildRoof();
    void buildWindows();
    void buildDoors();
    void buildGarage();

    HouseClasic getHouseClasic();
}

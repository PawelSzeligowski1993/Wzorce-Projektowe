package creativePatterns._01_Builder.hause;

import creativePatterns._01_Builder.hause.builderClasic.BigHouseBuilder;
import creativePatterns._01_Builder.hause.builderClasic.HouseClasic;
import creativePatterns._01_Builder.hause.builderClasic.HouseDirector;
import creativePatterns._01_Builder.hause.builderClasic.SmallHouseBuilder;
import creativePatterns._01_Builder.hause.hauseBuilder.House;

public class Main {
    public static void main(String[] args) {
//        HouseClasic hause1 = new HouseClasic("walls","floors","windows","rooms","doors", "garage");
//        HouseClasic hause2 = new HouseClasic("walls","floors","windows");
        //Builder z wewnetrzna klasa

        House house = new House.HauseBuilder()
                .buildWalls("walls")
                .buildfloors("floors")
                .buildRoof("roof")
                .buildRooms("rooms")
                .build();
        System.out.println(house);
        System.out.println(house);

        //Builder Clasic
        System.out.println("---BuilderClasic---\n");
        SmallHouseBuilder smallHouseBuilder = new SmallHouseBuilder();
        BigHouseBuilder bigHouseBuilder = new BigHouseBuilder();

        HouseDirector smallHouseDirector = new HouseDirector(smallHouseBuilder);
        smallHouseDirector.buildHouse();

        HouseDirector bigHouseDirector = new HouseDirector(bigHouseBuilder);
        bigHouseDirector.buildHouse();

        HouseClasic smallHouse = smallHouseDirector.getHouseClasic();
        HouseClasic bigHouse = bigHouseBuilder.getHouseClasic();

        System.out.println(smallHouse);
        System.out.println(bigHouse);

    }
}

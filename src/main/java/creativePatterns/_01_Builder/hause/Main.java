package creativePatterns._01_Builder.hause;

import creativePatterns._01_Builder.hause.builderClassic.BigHouseBuilder;
import creativePatterns._01_Builder.hause.builderClassic.HouseClassic;
import creativePatterns._01_Builder.hause.builderClassic.HouseDirector;
import creativePatterns._01_Builder.hause.builderClassic.SmallHouseBuilder;
import creativePatterns._01_Builder.hause.hauseBuilder.House;

public class Main {
    public static void main(String[] args) {
//        HouseClassic hause1 = new HouseClassic("walls","floors","windows","rooms","doors", "garage");
//        HouseClassic hause2 = new HouseClassic("walls","floors","windows");
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

        HouseClassic smallHouse = smallHouseDirector.getHouseClasic();
        HouseClassic bigHouse = bigHouseBuilder.getHouseClassic();

        System.out.println(smallHouse);
        System.out.println(bigHouse);

    }
}

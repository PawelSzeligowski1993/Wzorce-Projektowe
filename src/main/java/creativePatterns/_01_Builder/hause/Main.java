package creativePatterns._01_Builder.hause;

//import creativePatterns._01_Builder.hause.hauseBilder.Hause;

import creativePatterns._01_Builder.hause.hauseBuilder.Hause;

public class Main {
    public static void main(String[] args) {
//        Hause hause1 = new Hause("walls","floors","windows","rooms","doors", "garage");
//        Hause hause2 = new Hause("walls","floors","windows");
        Hause hause = new Hause.HauseBuilder()
                .buildWalls("walls")
                .buildfloors("floors")
                .buildRoof("roof")
                .buildRooms("rooms")
                .build();
        System.out.println(hause);
    }
}

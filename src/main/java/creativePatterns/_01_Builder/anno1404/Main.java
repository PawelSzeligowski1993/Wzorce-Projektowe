package creativePatterns._01_Builder.anno1404;

import creativePatterns._01_Builder.anno1404.builderClasic.*;

public class Main {
    public static void main(String[] args) {
        //Create Coalmine
        Coalmine_builder coalmine_builder = new Coalmine_builder();
        BuildingDirector coalmineDirector = new BuildingDirector(coalmine_builder);
        coalmineDirector.buildBuilding();
        BuildingClassic coalmine = coalmine_builder.getBuildingClassic();
        System.out.println(coalmine);
        System.out.println("\n");

        //Create Iron Ore Mine
        IronOreMine_builder ironOreMine_builder = new IronOreMine_builder();
        BuildingDirector ironOreDirector = new BuildingDirector(ironOreMine_builder);
        ironOreDirector.buildBuilding();
        BuildingClassic IronOreMine = ironOreMine_builder.getBuildingClassic();
        System.out.println(IronOreMine);
        System.out.println("\n");

        //Create Ironworks
        IronWorks_builder ironWorks_builder = new IronWorks_builder();
        BuildingDirector ironWorksDirector = new BuildingDirector(ironWorks_builder);
        ironWorksDirector.buildBuilding();
        BuildingClassic ironWorks = ironWorks_builder.getBuildingClassic();
        System.out.println(ironWorks);
        System.out.println("\n");

        //Create Lumberjack's Hut
        LumberjacksHut_builder lumberjacksHut_builder = new LumberjacksHut_builder();
        BuildingDirector lumberjacksHutDirector = new BuildingDirector(lumberjacksHut_builder);
        lumberjacksHutDirector.buildBuilding();
        BuildingClassic lumberjacksHut = lumberjacksHut_builder.getBuildingClassic();
        System.out.println(lumberjacksHut);
        System.out.println("\n");

        //Create Smithy
        Smithy_builder smithy_builder = new Smithy_builder();
        BuildingDirector smithyDirector = new BuildingDirector(smithy_builder);
        smithyDirector.buildBuilding();
        BuildingClassic smithy = smithy_builder.getBuildingClassic();
        System.out.println(smithy);
        System.out.println("\n");

        //Create Stonemason's Hut
        StoneMasonsHut_builder stoneMasonsHut_builder = new StoneMasonsHut_builder();
        BuildingDirector stoneMasonsHutDirector = new BuildingDirector(stoneMasonsHut_builder);
        stoneMasonsHutDirector.buildBuilding();
        BuildingClassic stoneMasonsHut = stoneMasonsHut_builder.getBuildingClassic();
        System.out.println(stoneMasonsHut);
        System.out.println("\n");
    }
}

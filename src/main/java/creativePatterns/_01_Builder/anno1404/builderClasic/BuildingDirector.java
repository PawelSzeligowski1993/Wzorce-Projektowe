package creativePatterns._01_Builder.anno1404.builderClasic;

public class BuildingDirector {
    private BuildingBuilder buildingBuilder;

    public BuildingDirector(BuildingBuilder buildingBuilder){
        this.buildingBuilder = buildingBuilder;
    }

    public void buildBuilding(){
            buildingBuilder.buildName();
            buildingBuilder.buildGold();
            buildingBuilder.buildTree();
            buildingBuilder.buildTools();
            buildingBuilder.buildStone();
            buildingBuilder.buildMaintenancePriceInGold();
            buildingBuilder.buildRequirements();
            buildingBuilder.buildProduction();
    }

    public BuildingClassic getBuildingClassic(){
        return this.buildingBuilder.getBuildingClassic();
    }
}

package creativePatterns._01_Builder.anno1404.builderClasic;

public class LumberjacksHut_builder implements BuildingBuilder{
    private BuildingClassic buildingClassic;
    public LumberjacksHut_builder(){
        this.buildingClassic = new BuildingClassic();
    }

    public void buildName(){
        this.buildingClassic.setBuildName("Lumberjack's Hut");
    }

    public void buildGold() {
        this.buildingClassic.setGold(50);
    }

    public void buildTree() {
        this.buildingClassic.setTree(1);
    }

    public void buildTools() {
        this.buildingClassic.setGold(2);
    }

    public void buildStone() {
        this.buildingClassic.setStone(0);
    }

    public void buildMaintenancePriceInGold() {
        this.buildingClassic.setMaintenancePriceInGold(5);
    }

    public void buildRequirements() {
        this.buildingClassic.setRequirements("Forest");
    }

    public void buildProduction() {
        this.buildingClassic.setProduction("Tree");
    }

    public BuildingClassic getBuildingClassic() {
        return buildingClassic;
    }
}

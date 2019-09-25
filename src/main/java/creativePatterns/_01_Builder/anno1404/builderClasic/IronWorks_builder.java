package creativePatterns._01_Builder.anno1404.builderClasic;

public class IronWorks_builder implements BuildingBuilder {
    private BuildingClassic buildingClassic;

    public IronWorks_builder() {
        this.buildingClassic = new BuildingClassic();
    }

    public void buildName(){
        this.buildingClassic.setBuildName("Ironworks");
    }

    public void buildGold() {
        this.buildingClassic.setGold(600);
    }

    public void buildTree() {
        this.buildingClassic.setTree(10);
    }

    public void buildTools() {
        this.buildingClassic.setTools(5);
    }

    public void buildStone() {
        this.buildingClassic.setStone(2);
    }

    public void buildMaintenancePriceInGold() {
        this.buildingClassic.setMaintenancePriceInGold(10);
    }

    public void buildRequirements() {
        this.buildingClassic.setRequirements("Carbon, Iron Ore");
    }

    public void buildProduction() {
        this.buildingClassic.setProduction("Iron");
    }

    public BuildingClassic getBuildingClassic() {
        return buildingClassic;
    }
}

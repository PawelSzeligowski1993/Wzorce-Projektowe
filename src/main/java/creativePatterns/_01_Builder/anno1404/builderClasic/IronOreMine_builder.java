package creativePatterns._01_Builder.anno1404.builderClasic;

public class IronOreMine_builder implements BuildingBuilder {
    private BuildingClassic buildingClassic;

    public IronOreMine_builder() {
        this.buildingClassic = new BuildingClassic();
    }

    public void buildName(){
        this.buildingClassic.setBuildName("Iron Ore Mine");
    }

    public void buildGold() {
        this.buildingClassic.setGold(1500);
    }

    public void buildTree() {
        this.buildingClassic.setTree(15);
    }

    public void buildTools() {
        this.buildingClassic.setTools(6);
    }

    public void buildStone() {
        this.buildingClassic.setStone(3);
    }

    public void buildMaintenancePriceInGold() {
        this.buildingClassic.setMaintenancePriceInGold(30);
    }

    public void buildRequirements() {
        this.buildingClassic.setRequirements("Iron Ore Deposit");
    }

    public void buildProduction() {
        this.buildingClassic.setProduction("Iron Ore");
    }

    public BuildingClassic getBuildingClassic() {
        return buildingClassic;
    }
}

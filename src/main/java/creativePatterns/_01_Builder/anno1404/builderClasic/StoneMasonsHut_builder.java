package creativePatterns._01_Builder.anno1404.builderClasic;

public class StoneMasonsHut_builder implements BuildingBuilder {
    private BuildingClassic buildingClassic;
    public StoneMasonsHut_builder(){
        this.buildingClassic = new BuildingClassic();
    }

    public void buildName(){
        this.buildingClassic.setBuildName("Stone Masons Hut");
    }

    public void buildGold() {
        this.buildingClassic.setGold(400);
    }

    public void buildTree() {
        this.buildingClassic.setTree(5);
    }

    public void buildTools() {
        this.buildingClassic.setTools(3);
    }

    public void buildStone() {
        this.buildingClassic.setStone(0);
    }

    public void buildMaintenancePriceInGold() {
        this.buildingClassic.setMaintenancePriceInGold(15);
    }

    public void buildRequirements() {
        this.buildingClassic.setRequirements("Stone Deposit");
    }

    public void buildProduction() {
        this.buildingClassic.setProduction("Stone");
    }

    public BuildingClassic getBuildingClassic() {
        return buildingClassic;
    }
}

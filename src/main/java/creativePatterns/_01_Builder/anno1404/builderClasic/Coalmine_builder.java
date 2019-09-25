package creativePatterns._01_Builder.anno1404.builderClasic;

public class Coalmine_builder implements BuildingBuilder {
    private BuildingClassic buildingClassic;

    public Coalmine_builder() {
        this.buildingClassic = new BuildingClassic();
    }

    public void buildName(){
        this.buildingClassic.setBuildName("Coalmine");
    }

    public void buildGold() {
        this.buildingClassic.setGold(900);
    }

    public void buildTree() {
        this.buildingClassic.setTree(12);
    }

    public void buildTools() {
        this.buildingClassic.setTools(2);
    }

    public void buildStone() {
        this.buildingClassic.setStone(2);
    }

    public void buildMaintenancePriceInGold() {
        this.buildingClassic.setMaintenancePriceInGold(15);
    }

    public void buildRequirements() {
        this.buildingClassic.setRequirements("Coal Deposit");
    }

    public void buildProduction() {
        this.buildingClassic.setProduction("Carbon");
    }

    public BuildingClassic getBuildingClassic() {
        return buildingClassic;
    }
}

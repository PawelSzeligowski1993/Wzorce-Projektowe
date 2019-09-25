package creativePatterns._01_Builder.anno1404.builderClasic;

public class Smithy_builder implements BuildingBuilder {
    private BuildingClassic buildingClassic;
    public Smithy_builder(){
        this.buildingClassic = new BuildingClassic();
    }

    public void buildName(){
        this.buildingClassic.setBuildName("Smithy");
    }

    public void buildGold() {
        this.buildingClassic.setGold(500);
    }

    public void buildTree() {
        this.buildingClassic.setTree(8);
    }

    public void buildTools() {
        this.buildingClassic.setTools(5);
    }

    public void buildStone() {
        this.buildingClassic.setStone(2);
    }

    public void buildMaintenancePriceInGold() {
        this.buildingClassic.setMaintenancePriceInGold(30);
    }

    public void buildRequirements() {
        this.buildingClassic.setRequirements("Iron");
    }

    public void buildProduction() {
        this.buildingClassic.setProduction("Tools");
    }

    public BuildingClassic getBuildingClassic() {
        return buildingClassic;
    }
}

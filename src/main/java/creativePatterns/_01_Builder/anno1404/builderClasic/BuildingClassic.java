package creativePatterns._01_Builder.anno1404.builderClasic;

public class BuildingClassic {
    private String buildName;
    private int gold;
    private int tree;
    private int tools;
    private int stone;
    private int maintenancePriceInGold;
    private String requirements;
    private String production;

    public void setBuildName(String buildName){
        this.buildName = buildName;
    }

    public String getBuildName() {
        return buildName;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public void setTree(int tree) {
        this.tree = tree;
    }

    public void setTools(int tools) {
        this.tools = tools;
    }

    public void setStone(int stone) {
        this.stone = stone;
    }

    public void setMaintenancePriceInGold(int maintenancePriceInGold) {
        this.maintenancePriceInGold = maintenancePriceInGold;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    @Override
    public String toString() {
        return "BuildingClassic{" +
                "buildName='" + buildName + '\'' +
                ", gold=" + gold +
                ", tree=" + tree +
                ", tools=" + tools +
                ", stone=" + stone +
                ", maintenancePriceInGold=" + maintenancePriceInGold +
                ", requirements='" + requirements + '\'' +
                ", production='" + production + '\'' +
                '}';
    }
}

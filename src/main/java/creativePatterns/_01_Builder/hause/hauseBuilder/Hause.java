/**
 * Wersja Builder z klasą wewnętrzną
 */
package creativePatterns._01_Builder.hause.hauseBuilder;

public class Hause {

    private String walls;
    private String floors;
    private String rooms;
    private String roof;
    private String windows;
    private String doors;
    private String garage;

    //Prywatny konstruktor z klasy HauseBilder
    private Hause(HauseBuilder hauseBuilder){
        this.walls = hauseBuilder.walls;
        this.floors = hauseBuilder.floors;
        this.rooms = hauseBuilder.rooms;
        this.roof = hauseBuilder.roof;
        this.windows = hauseBuilder.windows;
        this.doors = hauseBuilder.doors;
        this.garage = hauseBuilder.garage;
    }

    public String getWalls() {
        return walls;
    }
    public String getFloors() {
        return floors;
    }
    public String getRooms() {
        return rooms;
    }
    public String getRoof() {
        return roof;
    }
    public String getWindows() {
        return windows;
    }
    public String getDoors() {
        return doors;
    }
    public String getGarage() {
        return garage;
    }
    @Override
    public String toString() {
        return "Hause{" +
                "walls='" + walls + '\'' +
                ", floors='" + floors + '\'' +
                ", rooms='" + rooms + '\'' +
                ", roof='" + roof + '\'' +
                ", windows='" + windows + '\'' +
                ", doors='" + doors + '\'' +
                ", garage='" + garage + '\'' +
                '}';
    }

    public static class HauseBuilder{

        private String walls;
        private String floors;
        private String rooms;
        private String roof;
        private String windows;
        private String doors;
        private String garage;

        public HauseBuilder buildWalls(String walls){
            this.walls = walls;
            return this;
        }
        public HauseBuilder buildfloors(String floors){
            this.floors = floors;
            return this;
        }
        public HauseBuilder buildRooms(String rooms){
            this.rooms = rooms;
            return this;
        }
        public HauseBuilder buildRoof(String roof){
            this.roof = roof;
            return  this;
        }
        public HauseBuilder buildWindows(String windows){
            this.windows = windows;
            return this;
        }
        public HauseBuilder buildDoors(String doors){
            this.doors = doors;
            return this;
        }
        public HauseBuilder buildGarage(String garage){
            this.garage = garage;
            return this;
        }

        public Hause build(){
            return new Hause(this);
        }
    }
}

package creativePatterns._01_Builder.FlightLeg.flightLegBuilder;

public class FlightLeg {

    private String from;
    private String to;
    private Boolean delayed ;
    private int price;
    private String airPlane;

    private FlightLeg(FlightLegBuilder flightLegBuilder){
        this.from = flightLegBuilder.from;
        this.to = flightLegBuilder.to;
        this.delayed = flightLegBuilder.delayed;
        this.price = flightLegBuilder.price;
        this.airPlane = flightLegBuilder.airPlane;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public Boolean getDelayed() {
        return delayed;
    }

    public int getPrice() {
        return price;
    }

    public String getAirPlane() {
        return airPlane;
    }
    public void setDelayed(Boolean delayed) {
        this.delayed = delayed;
    }
    @Override
    public String toString() {
        return "FlightLeg{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", delayed=" + delayed +
                ", price=" + price +
                ", airPlane='" + airPlane + '\'' +
                '}';
    }

    public static class FlightLegBuilder {
        private String from;
        private String to;
        private Boolean delayed;
        private int price;
        private String airPlane;

        public FlightLegBuilder(String from, String to){
            this.from = from;
            this.to = to;
            this.delayed=false;
        }

        public FlightLegBuilder buildPrice(int price){
            this.price = price;
            return this;
        }
        public FlightLegBuilder buildAirPlane(String airPlane){
            this.airPlane = airPlane;
            return this;
        }

        public FlightLeg build(){
            if(this.price==0){
                throw new IllegalStateException("Brak wymaganego pola - cena");
            }
            return  new FlightLeg(this);
        }
    }
}

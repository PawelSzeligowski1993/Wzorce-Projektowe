package creativePatterns._01_Builder.FlightLeg;

import creativePatterns._01_Builder.FlightLeg.flightLegBuilder.FlightLeg;

public class Main {
    public static void main(String[] args) {
        FlightLeg flightLeg = new FlightLeg.FlightLegBuilder("Chicago","Berlin")
                .buildPrice(500)
                .buildAirPlane("Boeing 737")
                .build();
        System.out.println(flightLeg);

        flightLeg.setDelayed(true);
        System.out.println(flightLeg);
    }
}

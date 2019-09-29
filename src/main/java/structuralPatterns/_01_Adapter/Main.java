package structuralPatterns._01_Adapter;

import structuralPatterns._01_Adapter.socketAdapter.*;

public class Main {
    public static void main(String[] args) {

        ContinentalSocket continentalSocket = new ContinentalSocket();



        UKDSocket ukdSocket = new UKDSocket();
        UKDDevice ukRadio = new UKDDevice() {
            public void powerOn() {
                    System.out.println("London calling to the farway towns\n");
            }
        };

        ContinentalDevice continentalRadio = new ContinentalDevice() {
            public void on() {
                System.out.println("London calling to the underworld");
            }
        };

        TwoWayAdapter adapter = new TwoWayAdapter(ukRadio,continentalRadio);
        continentalSocket.plugIn(adapter);
        ukdSocket.plugIn(adapter);



    }
}

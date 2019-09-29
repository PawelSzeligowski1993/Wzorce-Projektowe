package structuralPatterns._01_Adapter;

import structuralPatterns._01_Adapter.socketAdapter.*;

public class Main {
    public static void main(String[] args) {

        ContinentalDevice radio = new ContinentalDevice() {
            public void on() {
                System.out.println("Gra muzyka");
            }
        };

        ContinentalSocket continentalSocket = new ContinentalSocket();
        continentalSocket.plugIn(radio);
        UKDDevice ukRadio = new UKDDevice() {
            public void powerOn() {
                    System.out.println("London calling to the farway towns\n");
            }
        };

        //Adapter implement
        UKDSocket ukdSocket = new UKDSocket();
        ukdSocket.plugIn(ukRadio);
        UKToContinentalAdapter adapter = new UKToContinentalAdapter(ukRadio);
        continentalSocket.plugIn(adapter);
    }
}

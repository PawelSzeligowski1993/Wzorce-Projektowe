package structuralPatterns._01_Adapter.socketAdapter;

public class UKToContinentalAdapter implements ContinentalDevice{

    UKDDevice device;

    public UKToContinentalAdapter(UKDDevice device) {
        this.device = device;
    }

    public void on() {
        device.powerOn();
    }
}

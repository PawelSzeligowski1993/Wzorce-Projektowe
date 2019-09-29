package structuralPatterns._01_Adapter.socketAdapter;

public class TwoWayAdapter implements UKDDevice, ContinentalDevice {

    UKDDevice ukdDevice;
    ContinentalDevice device;

    public TwoWayAdapter(UKDDevice ukdDevice, ContinentalDevice device) {
        this.ukdDevice = ukdDevice;
        this.device = device;
    }

    public void on() {
        ukdDevice.powerOn();
    }

    public void powerOn() {
        device.on();
    }
}

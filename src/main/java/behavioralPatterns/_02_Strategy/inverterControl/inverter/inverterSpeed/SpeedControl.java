package behavioralPatterns._02_Strategy.inverterControl.inverter.inverterSpeed;

public interface SpeedControl {
    void speedControl (int frequency, boolean switch1, boolean switch2, boolean switch3);
}

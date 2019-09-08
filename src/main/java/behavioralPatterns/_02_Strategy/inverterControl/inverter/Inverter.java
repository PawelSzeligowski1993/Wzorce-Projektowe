package behavioralPatterns._02_Strategy.inverterControl.inverter;

import behavioralPatterns._02_Strategy.inverterControl.inverter.inverterDirection.DirectionControl;
import behavioralPatterns._02_Strategy.inverterControl.inverter.inverterSpeed.SpeedControl;

public class Inverter {
    private DirectionControl directionControl;
    private SpeedControl speedControl;

    public void speed(int frequency, boolean switch1, boolean switch2, boolean switch3){
        this.speedControl.speedControl(frequency, switch1, switch2, switch3);
    }

    public void direction(boolean switch4, boolean switch5){
        this.directionControl.directionControl(switch4, switch5);
    }

    public void setDirectionControl(DirectionControl directionControl) {
        this.directionControl = directionControl;
    }

    public void setSpeedControl(SpeedControl speedControl) {
        this.speedControl = speedControl;
    }
}

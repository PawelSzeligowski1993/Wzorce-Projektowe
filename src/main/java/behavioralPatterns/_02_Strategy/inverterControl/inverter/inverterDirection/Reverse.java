package behavioralPatterns._02_Strategy.inverterControl.inverter.inverterDirection;

public class Reverse implements DirectionControl {
    public void directionControl(boolean switch4, boolean switch5) {
        if(switch4==false && switch5==true){
            System.out.println("Direction Control Reverse - Kierunek Tył");
        }else {
            System.out.println("Direction Control Fault - Brak kierunku");
        }
    }
}

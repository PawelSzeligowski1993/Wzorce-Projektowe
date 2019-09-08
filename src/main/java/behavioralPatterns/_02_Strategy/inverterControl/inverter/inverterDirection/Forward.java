package behavioralPatterns._02_Strategy.inverterControl.inverter.inverterDirection;

public class Forward implements DirectionControl {
    public void directionControl(boolean switch4, boolean switch5) {
        if(switch4==true && switch5==false){
            System.out.println("Direction Control Forward - Kierunek Przód");
        }else {
            System.out.println("Direction Control Fault - Brak kierunku");
        }
    }
}

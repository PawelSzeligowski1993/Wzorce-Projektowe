package behavioralPatterns._02_Strategy.inverterControl.inverter.inverterSpeed;

public class Speed3 implements SpeedControl {
    public void speedControl(int frequency, boolean switch1, boolean switch2, boolean switch3) {
        if(switch1==true && switch2==true && switch3==true){
            System.out.println("Speed2 = Prędkośc Silnika ustawiona na 100% = " + frequency + "Hz");
        }else {
            System.out.println("Brak prędkosci Speed3");
        }
    }
}

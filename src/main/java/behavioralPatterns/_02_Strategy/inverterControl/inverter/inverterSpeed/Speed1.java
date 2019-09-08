package behavioralPatterns._02_Strategy.inverterControl.inverter.inverterSpeed;

public class Speed1 implements SpeedControl {
    public void speedControl(int frequency, boolean switch1, boolean switch2, boolean switch3) {
        if(switch1==true && switch2==false && switch3==false){
            System.out.println("Speed1 = Prędkośc Silnika ustawiona na 25% = " + frequency*0.25 + "Hz");
        }else {
            System.out.println("Brak prędkosci Speed1");
        }
    }
}

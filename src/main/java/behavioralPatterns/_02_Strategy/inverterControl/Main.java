package behavioralPatterns._02_Strategy.inverterControl;

import behavioralPatterns._02_Strategy.inverterControl.inverter.Inverter;
import behavioralPatterns._02_Strategy.inverterControl.inverter.inverterDirection.Forward;
import behavioralPatterns._02_Strategy.inverterControl.inverter.inverterDirection.Reverse;
import behavioralPatterns._02_Strategy.inverterControl.inverter.inverterSpeed.Speed1;
import behavioralPatterns._02_Strategy.inverterControl.inverter.inverterSpeed.Speed2;
import behavioralPatterns._02_Strategy.inverterControl.inverter.inverterSpeed.Speed3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/**
 *  int frequency = 80;      // Frequency inverter Output (Motor Speed)
 *  boolean Switch1 = false; //= 30% speed
 *  boolean Switch2 = false; //+Switch1 = 60% speed
 *  boolean Switch3 = false; //+Switch2 + Switch1 = 100% speed
 *  boolean Switch4 = false; // Forward
 *  boolean Switch5 = false; // Reverse
 */
        boolean end1 = false;
        boolean end2 = false;
        String value;

        Scanner scanner = new Scanner(System.in);
        Inverter inverter = new Inverter();

        while (end1!=true){
            System.out.println("Parametry Invertera Direction Control" + "\n\n" +
                    "Wybierz kierunek 4 = Forward, 5 = Reverse");
            value = scanner.nextLine();
            if (value.equals("4")){
                directionForward(inverter);
                end1=true;
            } else if (value.equals("5")) {
                directionReverse(inverter);
                end1=true;
            }else {
                System.out.println("Fault, Try once again");
            }
        }

        while(end2!=true) {
            System.out.println("Parametry Invertera Speed Control" + "\n\n" +
                    "Wybierz Prędkość 1 = Speed1 30%, 2 = Speed2 60%, 3 = Speed3 = 100%");
             value = scanner.nextLine();
            if (value.equals("1")) {
                Speed1(inverter);
                end2 = true;
            } else if (value.equals("2")) {
                Speed2(inverter);
                end2 = true;
            } else if (value.equals("3")) {
                Speed3(inverter);
                end2 = true;
            } else
                System.out.println("Fault, Try once again");
        }
    }
    private static void Speed3(Inverter inverter) {
        boolean Switch1;
        boolean Switch2;
        boolean Switch3;//Speed3
        Switch1 = true;
        Switch2 = true;
        Switch3 = true;
        inverter.setSpeedControl(new Speed3());
        inverter.speed(80, Switch1, Switch2, Switch3);
    }
    private static void Speed2(Inverter inverter) {
        boolean Switch1;
        boolean Switch2;
        boolean Switch3;//Speed2
        Switch1 = true;
        Switch2 = true;
        Switch3 = false;
        inverter.setSpeedControl(new Speed2());
        inverter.speed(80, Switch1, Switch2, Switch3);
    }
    private static void Speed1(Inverter inverter) {
        boolean Switch1;
        boolean Switch2;
        boolean Switch3;//Speed1
        Switch1 = true;
        Switch2 = false;
        Switch3 = false;
        inverter.setSpeedControl(new Speed1());
        inverter.speed(80, Switch1, Switch2, Switch3);
    }
    private static void directionReverse(Inverter inverter) {
        boolean Switch4;
        boolean Switch5;//  Ustawianie kierunku pracy tył
        Switch4 = false;
        Switch5 = true;
        inverter.setDirectionControl(new Reverse());
        inverter.direction(Switch4, Switch5);
    }
    private static void directionForward(Inverter inverter) {
        boolean Switch4;
        boolean Switch5;
        //  Ustawianie kierunku Pracy przód
        Switch4 = true;
        Switch5 = false;
        inverter.setDirectionControl(new Forward());
        inverter.direction(Switch4,Switch5);
    }
}

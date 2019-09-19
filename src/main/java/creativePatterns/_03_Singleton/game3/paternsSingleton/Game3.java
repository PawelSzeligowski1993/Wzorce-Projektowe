package creativePatterns._03_Singleton.game3.paternsSingleton;

import java.util.Random;
import java.util.Scanner;

public class Game3 {
    private Random generator = new Random();
    private Scanner scanner = new Scanner(System.in);
    private int value;
    private String userDay;
    private String userMonth;
    private int result =0;
    //Singleton
    private static Game3 instance = new Game3();

    private Game3(){}
    public static Game3 getInstance() {
        return instance;
    }
    protected Object redResolve() {return getInstance();}

    public int getResult() {
        return result;
    }
    //
    public void play3 (boolean daysOfTheWeek, boolean monthOfTheYear)
    {
        for (int i=0;i <11; i++)
        {
            if (daysOfTheWeek == true) {
                value=generator.nextInt(6);
                String[] daysOfWeek = new String[7];
                daysOfWeek[0] = "Monday";
                daysOfWeek[1] = "Tuesday";
                daysOfWeek[2] = "Wednesday";
                daysOfWeek[3] = "Thursday";
                daysOfWeek[4] = "Friday";
                daysOfWeek[5] = "Saturday";
                daysOfWeek[6] = "Sunday";
                System.out.println("Enter "+(value+1)+" the day of the week");
                userDay = scanner.nextLine();
                if(userDay.equals(daysOfWeek[value])){
                    System.out.println("Days Ok");
                    result++;
                }
                else {
                    System.out.println("Day not Ok");
                }

            }
            if (monthOfTheYear == true) {
                value=generator.nextInt(11);
                String[] monthOfYear = new String[12];
                generator.nextInt(11);
                monthOfYear[0] = "January";
                monthOfYear[1] = "February";
                monthOfYear[2] = "March";
                monthOfYear[3] = "April";
                monthOfYear[4] = "May";
                monthOfYear[5] = "June";
                monthOfYear[6] = "July";
                monthOfYear[7] = "August";
                monthOfYear[8] = "September";
                monthOfYear[9] = "October";
                monthOfYear[10] = "November";
                monthOfYear[11] = "December";
                System.out.println("Enter "+(value+1)+" the month of the year");
                userMonth = scanner.nextLine();
                if(userMonth.equals(monthOfYear[value])){
                    System.out.println("Month ok");
                    result++;
                }else {
                    System.out.println("Month not ok");
                }
            }
            System.out.println("Your Score = "+result+"/"+(i+1));
        }

    }

}

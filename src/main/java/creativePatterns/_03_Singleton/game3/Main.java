package creativePatterns._03_Singleton.game3;


import creativePatterns._03_Singleton.game3.paternsSingleton.Game3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game3 game3 =  Game3.getInstance();
        Scanner scanner = new Scanner(System.in);
        boolean stopLoop = false;

        while (stopLoop != true){
        System.out.println("Select game level \n1 = Easy, 2 = Medium, 3 = Hard");
        int level = scanner.nextInt();
        switch (level) {
            case 1:{
                game3.play3(true, false);
                stopLoop = true;
                break;}
            case 2:{
                game3.play3(false, true);
                stopLoop = true;
                break;}
            case 3:{
                game3.play3(true, true);
                stopLoop = true;}
            default:{
                System.out.println("Not Found Level!");}
        }

            System.out.println("poiu");


        }

        game3.play3(true, true);

    }
}

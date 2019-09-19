package creativePatterns._03_Singleton.game2.paternsSingleton;


import java.util.Random;
import java.util.Scanner;

public class GuessGame {

    private int counter =0;
    private int userResult = 0;
    private int drawResult = 0;
    private int result = 0;
    private static GuessGame instance = new GuessGame();


    private Random generator = new Random();
    private Scanner scanner = new Scanner(System.in);

    private GuessGame(){}
    public static GuessGame getInstance(){
        return instance;
    }
    protected Object redResolve(){
        return getInstance();
    }

    public int getResult() {
        return result;
    }

    public void draw(){

        System.out.println("Gra losowanie Cyfry ");
        while(counter<11){
            drawResult = generator.nextInt(9);
                System.out.println("Wprowadź liczbę od 0-9");
                userResult = scanner.nextInt();
                if (drawResult == userResult) {
                    result++;
                    System.out.println("Zdobywasz Punkt! \nIlość Punktów = " + result);
                } else {
                    System.out.println("Zły Strzał, Cyfra = " + drawResult);
                }
            counter++;
        }
        System.out.println("Koniec, twój wynik to "+result+"/11");
    }


}

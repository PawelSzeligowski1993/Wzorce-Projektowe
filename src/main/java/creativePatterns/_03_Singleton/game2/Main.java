package creativePatterns._03_Singleton.game2;


import creativePatterns._03_Singleton.game2.paternsSingleton.GuessGame;

public class Main {
    public static void main(String[] args) {
        GuessGame guessGame = GuessGame.getInstance();

        guessGame.draw();

        int score = guessGame.getResult();

        GuessGame anotherGameReference = GuessGame.getInstance();

        if(guessGame == anotherGameReference){
            System.out.println("Singleton!");
            if(score==anotherGameReference.getResult()){
                System.out.println("I punkty się zgadzają");
            }
        }
    }
}

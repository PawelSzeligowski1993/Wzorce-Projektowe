package creativePatterns._03_Singleton.game;

import creativePatterns._03_Singleton.game.paternsSingleton.GameEngine;

public class Main {
    public static void main(String[] args) {
        GameEngine engine = GameEngine.getInstance();
        GameEngine engine2 = GameEngine.getInstance();

        System.out.println(engine==engine2);
    }
}

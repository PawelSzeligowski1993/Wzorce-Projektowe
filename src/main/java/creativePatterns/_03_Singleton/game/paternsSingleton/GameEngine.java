package creativePatterns._03_Singleton.game.paternsSingleton;

import java.io.Serializable;

public class GameEngine implements Serializable {

    private static final long serialVersionUID = 23232323;

    private int hp = 100;
    private String characterName = "";
    private static GameEngine instance;

    private GameEngine(){}
    public void run(){
        while (true){
            //Czekamy na input gracza
            //zmieniamy stan gry
            //renderujemy grafike
        }
    }

    public static GameEngine getInstance(){
        if (instance==null){
            instance = new GameEngine();
        }
        return instance;
    }

    protected Object readResolve(){
        return getInstance();
    }
}
/**
 * ---Singleton jest uzywany tylko wtedy gdy chcemy mieć tylko jedną instancję danej klasy---
 * wielowątkowść
 * Sinleton zapewnia unikalność tylko i wyłącznie dla jednego ClasLoadera
 * Serializacja
 * refleksja
 */
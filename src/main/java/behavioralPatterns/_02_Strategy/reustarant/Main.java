package behavioralPatterns._02_Strategy.reustarant;

import behavioralPatterns._02_Strategy.reustarant.chef.Chef;
import behavioralPatterns._02_Strategy.reustarant.chef.egg_cooker.HardBoiledEggCooker;
import behavioralPatterns._02_Strategy.reustarant.chef.egg_cooker.SoftBoiledEggCooker;

public class Main {
    public static void main(String[] args) {

        Chef chef = new Chef("Gordon Gessler");
        //Nowe zamowienie jajka na twardo!
        chef.setEggCooker(new HardBoiledEggCooker());
        chef.cook();
        //nowe zamowienie jajka na miękko!
        chef.setEggCooker(new SoftBoiledEggCooker());
        chef.cook();
    }

}

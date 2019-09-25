package creativePatterns._02_Factory.strategyGame;

public abstract class Unit {
    private int hp;
    private int exp;
    private int dmgDone;

    public Unit(int hp, int exp, int dmgDone){
        this.hp = hp;
        this.exp = exp;
        this.dmgDone = dmgDone;
    }

    public int getHp() {
        return hp;
    }

    public int getExp() {
        return exp;
    }

    public int getDmgDone() {
        return dmgDone;
    }
}

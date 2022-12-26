package Armors;

/**
 * @author DimS on 25.12.2022
 */
public abstract class Armor {
    private int defence;

    public Armor(int defence){}

    public Armor() {
        this.defence = 10;
    }

    public int getDefence() {
        return defence;
    }
}

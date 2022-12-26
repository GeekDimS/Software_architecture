package Weapons;

/**
 * @author DimS on 25.12.2022
 */
public abstract class Weapon {
    protected int damage;

    protected Weapon(int damage) {
        this.damage = damage;
    }
    public int getDamage(){
        return damage;
    }
}

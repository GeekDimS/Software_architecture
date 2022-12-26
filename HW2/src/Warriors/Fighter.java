package Warriors;

import Armors.Armor;
import Weapons.Weapon;

/**
 * @author DimS on 25.12.2022
 */
public abstract class Fighter {
    private Weapon weapon;
    private Armor armor;
    private int health;
    public boolean isAlive;
    public String name;

    public Fighter(String name, Weapon weapon, Armor armor, int health) {
        this.weapon = weapon;
        this.armor = armor;
        this.health = health;
        this.isAlive =true;
        this.name = name;
    }

    public void attack(Fighter fighter) {
        if(!this.isAlive) return;
        int dmg = this.weapon.getDamage() - fighter.armor.getDefence()/10;
        System.out.println(this.name + " нанёс " + dmg +" урона");
        fighter.getDamage(dmg);
    }

    private void getDamage(int damage) {
        if (this.isAlive){
            this.health = this.health - damage;
            System.out.println(this.name + ": у меня осталось "+ this.health + " здоровья");
            if(this.health <= 0){
                this.isAlive = false;
                this.die();
            }

        }
        else {
            System.out.println("Не стоит атаковать мёртвое тело");
        }
    }

    private void die() {
        System.out.println("Герой " + this.name + " убит");
    }

    @Override
    public String toString() {
        return "Fighter{" +
                "name=" + name +
                ", weapon=" + weapon.getDamage() +
                ", armor=" + armor.getDefence() +
                ", health=" + health +
                ", isAlive=" + isAlive +
                '}';
    }
}

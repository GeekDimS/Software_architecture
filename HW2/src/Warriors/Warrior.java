package Warriors;

import Armors.Armor;
import Weapons.Weapon;

/**
 * @author DimS on 25.12.2022
 */
public class Warrior extends Fighter{
    public Warrior(String name,Weapon weapon, Armor armor, int health) {

        super(name, weapon, armor, health);
        System.out.println("Создан объект Warrior");
    }
}

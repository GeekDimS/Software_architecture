package Warriors;

import Armors.Armor;
import Weapons.Weapon;

/**
 * @author DimS on 25.12.2022
 */
public class Archer extends Fighter {
    public Archer(String name, Weapon weapon, Armor armor, int health) {

        super(name, weapon, armor, health);
        System.out.println("Создан объект Archer");
    }
}

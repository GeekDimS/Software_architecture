import Armors.Armor;
import Armors.HeavyArmor;
import Armors.SkinArmor;
import Warriors.Archer;
import Warriors.Fighter;
import Warriors.Warrior;
import Weapons.NoviceBow;
import Weapons.NoviceSword;
import Weapons.Weapon;

/**
 * @author DimS on ${DATE}
 */
public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");
        Weapon bow1 = new NoviceBow(20);
        Armor armor1 = new SkinArmor(10);
        Fighter archer1 = new Archer("Лучник", bow1, armor1, 100);
        System.out.println(archer1.toString());

        Weapon sword2 = new NoviceSword(10);
        Armor armor2 = new HeavyArmor(100);
        Fighter warrior2 = new Warrior("Воин", sword2, armor2, 200);
        System.out.println(archer1.toString());

        System.out.println("---------------------------------------------");
        while (archer1.isAlive && warrior2.isAlive){
            archer1.attack(warrior2);
            warrior2.attack(archer1);
        }
    }
}
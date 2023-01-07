package Fasade;

/**
 * @author DimS on 07.01.2023
 */
public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        Milk milk = new Milk();
        Sugar sugar = new Sugar();
        Tea tea = new Tea();
        Water water = new Water();

        AutomaticCafe automaticCafe = new AutomaticCafe(coffee, milk, sugar, tea, water);
        automaticCafe.makeCoffeeWithoutSugarWithMilk();
    }
}


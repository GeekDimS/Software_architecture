package Fasade;

/**
 * @author DimS on 07.01.2023
 */
public class AutomaticCafe {
    Coffee coffee;
    Milk milk;
    Sugar sugar;
    Tea tea;
    Water water;

    public AutomaticCafe(Coffee coffee, Milk milk, Sugar sugar, Tea tea, Water water) {
        this.coffee = coffee;
        this.milk = milk;
        this.sugar = sugar;
        this.tea = tea;
        this.water = water;
    }

    void pourCup(){
        System.out.println("Налито в кружку");
    }

    void mix(){
        System.out.println("Перемешали");
    }

    void makeSweetTea(){
        this.water.boil();
        this.tea.add(1);
        this.water.add(200);
        this.sugar.add(2);
        this.mix();
        this.pourCup();
        System.out.println("Ваш сладкий чай готов");
    }

    void makeTeaWithoutSugar(){
        this.water.boil();
        this.tea.add(1);
        this.water.add(200);
        this.mix();
        this.pourCup();
        System.out.println("Ваш чай без сахара готов");
    }

    void makeVerySweetTea(){
        this.water.boil();
        this.tea.add(1);
        this.water.add(200);
        this.sugar.add(3);
        this.mix();
        this.pourCup();
        System.out.println("Ваш сладкий-сладкий чай готов");
    }

    void makeSweetCoffee(){
        this.water.boil();
        this.coffee.add(1);
        this.water.add(200);
        this.sugar.add(2);
        this.mix();
        this.pourCup();
        System.out.println("Ваш сладкий кофе готов");
    }

    void makeCoffeeWithoutSugarWithMilk(){
        this.water.boil();
        this.coffee.add(1);
        this.water.add(150);
        this.milk.add(50);
        this.mix();
        this.pourCup();
        System.out.println("Ваш кофе с молоком готов");
    }
}

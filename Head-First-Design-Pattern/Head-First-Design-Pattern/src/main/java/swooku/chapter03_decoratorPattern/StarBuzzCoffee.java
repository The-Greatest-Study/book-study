package swooku.chapter03_decoratorPattern;

import swooku.chapter03_decoratorPattern.Bevarage.*;

public class StarBuzzCoffee {

    public static void main(String args[]) {
        Beverage beverage = new Espresso();

        System.out.println(beverage.getDescription() + " >> 가격($" + beverage.cost() + ")");

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " >> 가격($" + beverage2.cost() + ")");

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " >> 가격($" + beverage3.cost() + ")");
    }
}

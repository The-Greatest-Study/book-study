package minho.chapter03_decorator;

import minho.chapter03_decorator.Beverage.*;

import static minho.chapter03_decorator.Beverage.Beverage.Size.*;

public class StarBuzzCoffee {
    public static void main(String[] args){
        Beverage beverage1 = new Espresso(TALL);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        Beverage beverage2 = new DarkRoast(GRANDE);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend(VENTI);
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}

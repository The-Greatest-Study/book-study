package jiin.chapter03_decorator;

import jiin.chapter03_decorator.beverage.Beverage;
import jiin.chapter03_decorator.beverage.DarkRoast;
import jiin.chapter03_decorator.beverage.Espresso;
import jiin.chapter03_decorator.beverage.decorator.Mocha;
import jiin.chapter03_decorator.beverage.decorator.Soy;
import jiin.chapter03_decorator.beverage.decorator.Whip;

import static jiin.chapter03_decorator.beverage.Beverage.Size.GRANDE;
import static jiin.chapter03_decorator.beverage.Beverage.Size.TALL;
import static jiin.chapter03_decorator.beverage.Beverage.Size.VENTI;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage1 = new Espresso(TALL);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        // 더 깔끔하게 작성할 수는 없는 걸까...
        Beverage beverage2 = new DarkRoast(GRANDE);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new DarkRoast(VENTI);
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}

package minji.chapter03_decoratorPattern;

import minji.chapter03_decoratorPattern.Decorator.Mocha;
import minji.chapter03_decoratorPattern.Decorator.Whip;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        System.out.println("원래 다크로스트 가격 ===> " + beverage2.cost());

        beverage2 = new Mocha(beverage2);
        System.out.println("모카 1샷 추가 ===> " + beverage2.cost());

        beverage2 = new Mocha(beverage2);
        System.out.println("모카 2샷 추가 ===> " + beverage2.cost());

        beverage2 = new Whip(beverage2);
        System.out.println("휘핑크림 추가 ===> " + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3.setSize(Beverage.Size.VENTI);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.cost()); // 1.5 + 0.2 = 1.7


    }
}

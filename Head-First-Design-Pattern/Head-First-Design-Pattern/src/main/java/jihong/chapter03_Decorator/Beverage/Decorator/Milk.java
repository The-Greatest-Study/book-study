package jihong.chapter03_Decorator.Beverage.Decorator;

import jihong.chapter03_Decorator.Beverage.Beverage;

public class Milk extends CondimentDecorator {
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + .10;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 우유";
    }
}

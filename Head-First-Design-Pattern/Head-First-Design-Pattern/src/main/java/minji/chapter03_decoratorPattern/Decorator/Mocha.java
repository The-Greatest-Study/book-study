package minji.chapter03_decoratorPattern.Decorator;

import minji.chapter03_decoratorPattern.Beverage;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if (beverage.getSize() == Size.TALL) {
            cost += 0.10;
        } else if (beverage.getSize() == Size.GRANDE) {
            cost += 0.15;
        } else {
            cost += 0.20;
        }
        return cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 모카";
    }
}

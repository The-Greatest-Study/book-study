package jiin.chapter03_decorator.beverage.decorator;

import static jiin.chapter03_decorator.beverage.Beverage.Size.*;

import jiin.chapter03_decorator.beverage.Beverage;
import lombok.Builder;
import lombok.Getter;

@Getter
public class Mocha implements CondimentDecorator {
    private Beverage beverage;
    private Size size;

    @Builder
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
        this.size = this.beverage.getSize();
    }

    @Override
    public double cost() {
        double costBySize = 0;

        if (TALL.equals(size)) {
            costBySize = .20;
        } else if (GRANDE.equals(size)) {
            costBySize = .30;
        } else if (VENTI.equals(size)) {
            costBySize = .40;
        }

        return roundCost(beverage.cost() + costBySize);
    }

    private double roundCost(double cost) {
        return Double.parseDouble(String.format("%.2f", cost));
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 모카";
    }
}

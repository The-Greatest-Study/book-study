package jiin.chapter03_decorator.beverage.decorator;

import static jiin.chapter03_decorator.beverage.Beverage.Size.*;

import jiin.chapter03_decorator.beverage.Beverage;
import lombok.Builder;
import lombok.Getter;

@Getter
public class Whip implements CondimentDecorator {
    private Beverage beverage;
    private Size size;

    @Builder
    public Whip(Beverage beverage) {
        this.beverage = beverage;
        this.size = this.beverage.getSize();
    }

    @Override
    public double cost() {
        double costBySize = 0;

        if (TALL.equals(size)) {
            costBySize = .10;
        } else if (GRANDE.equals(size)) {
            costBySize = .15;
        } else if (VENTI.equals(size)) {
            costBySize = .20;
        }

        return roundCost(beverage.cost() + costBySize);
    }

    private double roundCost(double cost) {
        return Double.parseDouble(String.format("%.2f", cost));
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 휘핑크림";
    }
}

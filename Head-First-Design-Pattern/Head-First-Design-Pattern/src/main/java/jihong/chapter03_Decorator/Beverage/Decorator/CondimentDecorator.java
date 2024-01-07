package jihong.chapter03_Decorator.Beverage.Decorator;

import jihong.chapter03_Decorator.Beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    public abstract String getDescription();
}

package minji.chapter03_decoratorPattern.Decorator;

import minji.chapter03_decoratorPattern.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    public abstract String getDescription();
}

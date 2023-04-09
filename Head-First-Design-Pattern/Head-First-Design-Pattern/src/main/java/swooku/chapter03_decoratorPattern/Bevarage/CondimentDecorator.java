package swooku.chapter03_decoratorPattern.Bevarage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    public abstract String getDescription();
}
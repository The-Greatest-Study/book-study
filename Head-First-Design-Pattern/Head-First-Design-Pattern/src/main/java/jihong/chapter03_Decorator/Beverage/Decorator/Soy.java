package jihong.chapter03_Decorator.Beverage.Decorator;

import jihong.chapter03_Decorator.Beverage.Beverage;

public class Soy extends CondimentDecorator{
    public Soy(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return beverage.cost() + .15;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 두유";
    }
}

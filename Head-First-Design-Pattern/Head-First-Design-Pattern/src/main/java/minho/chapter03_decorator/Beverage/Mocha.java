package minho.chapter03_decorator.Beverage;

public class Mocha extends CondimentDecorator{

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if(beverage.getSize() == Size.TALL) cost += .10;
        else if(beverage.getSize() == Size.GRANDE) cost += .15;
        else cost += .20;

        return cost;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", 모카";
    }
}

package jihong.chapter03_Decorator;

public class Mocha extends CondimentDecorator{
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return beverage.cost() + .20;
    }

    @Override
    public String getDescripton() {
        return beverage.getDescription() + ", 모카";
    }
}

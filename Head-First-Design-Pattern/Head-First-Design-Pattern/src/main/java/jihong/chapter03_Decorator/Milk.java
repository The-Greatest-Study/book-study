package jihong.chapter03_Decorator;

public class Milk extends CondimentDecorator{
    public Milk(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return beverage.cost() + .10;
    }

    @Override
    public String getDescripton() {
        return beverage.getDescription() + ", 우유";
    }
}

package jihong.chapter03_Decorator;

public class Whip extends CondimentDecorator{
    public Whip(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return beverage.cost() + .10;
    }

    @Override
    public String getDescripton() {
        return beverage.getDescription() + ", 휘핑크림";
    }
}

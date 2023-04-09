package jihong.chapter03_Decorator;

public class Soy extends CondimentDecorator{
    public Soy(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return beverage.cost() + .15;
    }

    @Override
    public String getDescripton() {
        return beverage.getDescription() + ", 두유";
    }
}

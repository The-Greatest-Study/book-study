package jihong.chapter03_Decorator.Beverage;

import jihong.chapter03_Decorator.Beverage.Beverage;

public class Espresso extends Beverage {
    public Espresso(){
        description="에스프레소";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}

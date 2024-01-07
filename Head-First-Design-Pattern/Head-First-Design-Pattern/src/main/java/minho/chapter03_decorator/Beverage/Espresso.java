package minho.chapter03_decorator.Beverage;

public class Espresso extends Beverage {
    public Espresso(Size size) {
        this.description = "에스프레소";
        this.size = size;
    }

    @Override
    public double cost() {
        return 1.99;
    }
}

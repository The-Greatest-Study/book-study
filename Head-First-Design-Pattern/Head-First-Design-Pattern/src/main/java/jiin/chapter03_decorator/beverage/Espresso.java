package jiin.chapter03_decorator.beverage;

import lombok.Getter;

@Getter
public class Espresso implements Beverage {
    private final String description = "에스프레소";
    private Size size;

    public Espresso(Size size) {
        this.size = size;
    }

    @Override
    public double cost() {
        return 1.99;
    }
}

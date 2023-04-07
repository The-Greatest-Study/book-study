package jiin.chapter03_decorator.beverage;

import lombok.Getter;

@Getter
public class Decaf implements Beverage {
    private final String description = "디카페인 커피";
    private Size size;

    public Decaf(Size size) {
        this.size = size;
    }

    @Override
    public double cost() {
        return 1.05;
    }
}

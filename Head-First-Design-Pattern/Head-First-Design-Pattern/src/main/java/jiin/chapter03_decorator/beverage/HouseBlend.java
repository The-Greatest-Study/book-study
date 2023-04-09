package jiin.chapter03_decorator.beverage;

import lombok.Getter;

@Getter
public class HouseBlend implements Beverage {
    private final String description = "하우스 블렌드 커피";
    private Size size;

    public HouseBlend(Size size) {
        this.size = size;
    }

    @Override
    public double cost() {
        return .89;
    }
}

package jiin.chapter03_decorator.beverage;

import lombok.Getter;

@Getter
public class DarkRoast implements Beverage {
    private final String description = "다크 로스트 커피";
    private Size size;

    public DarkRoast(Size size) {
        this.size = size;
    }

    @Override
    public double cost() {
        return .99;
    }
}

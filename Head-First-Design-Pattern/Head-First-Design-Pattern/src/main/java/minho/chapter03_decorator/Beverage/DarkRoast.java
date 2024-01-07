package minho.chapter03_decorator.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast(Size size) {
        this.description = "다크로스트 커피";
        this.size = size;
    }

    @Override
    public double cost() {
        return .99;
    }
}

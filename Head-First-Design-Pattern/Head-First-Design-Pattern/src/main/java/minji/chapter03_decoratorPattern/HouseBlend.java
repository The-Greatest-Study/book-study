package minji.chapter03_decoratorPattern;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "하우스 블렌드 커피";
    }

    @Override
    public double cost() {
        Double cost;
        if (this.size == Size.TALL) {
            cost = 0.89;
        } else if (this.size == Size.GRANDE) {
            cost = 1.15;
        } else {
            cost = 1.5;
        }
        return cost;
    }
}

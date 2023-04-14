package minji.chapter03_decoratorPattern;

public class Decaf extends Beverage {
    public Decaf() {
        this.description = "디카페인";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}

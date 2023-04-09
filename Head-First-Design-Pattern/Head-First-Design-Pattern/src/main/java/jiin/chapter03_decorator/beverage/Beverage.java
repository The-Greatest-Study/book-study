package jiin.chapter03_decorator.beverage;

public interface Beverage {
    enum Size{ TALL, GRANDE, VENTI };

    String getDescription();
    Size getSize();

    double cost();
}

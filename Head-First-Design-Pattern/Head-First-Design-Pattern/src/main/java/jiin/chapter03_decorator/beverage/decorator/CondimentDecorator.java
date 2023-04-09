package jiin.chapter03_decorator.beverage.decorator;

import jiin.chapter03_decorator.beverage.Beverage;

public interface CondimentDecorator extends Beverage {
    Beverage getBeverage();
}

package jihong.chapter12_MVC.Factory;

import jihong.chapter12_MVC.Decorator.QuackCounter;
import jihong.chapter12_MVC.Duck.*;

public class CountingDuckFactory extends AbstractDuckFactory {

    @Override
    public Quackable createMallarDuck() {
        return new QuackCounter(new Mallardduck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}

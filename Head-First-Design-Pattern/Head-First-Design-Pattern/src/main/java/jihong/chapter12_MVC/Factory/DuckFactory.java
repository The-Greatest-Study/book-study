package jihong.chapter12_MVC.Factory;

import jihong.chapter12_MVC.Duck.*;

public class DuckFactory extends AbstractDuckFactory {

    @Override
    public Quackable createMallarDuck() {
        return new Mallardduck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}

package jihong.chapter12_MVC.Factory;

import jihong.chapter12_MVC.Duck.Quackable;

public abstract class AbstractDuckFactory {
    public abstract Quackable createMallarDuck();

    public abstract Quackable createRedheadDuck();

    public abstract Quackable createDuckCall();

    public abstract Quackable createRubberDuck();
}

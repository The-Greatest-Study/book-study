package minho.chapter12_composite_pattern.duck_simulation;

public class CountingDuckFactory extends AbstractDuckFactory{

    @Override
    public Quackable createMallardDuck() {
        return QuackCounter.from(MallardDuck.newInstance());
    }

    @Override
    public Quackable createRedheadDuck() {
        return QuackCounter.from(RedheadDuck.newInstance());
    }

    @Override
    public Quackable createDuckCall() {
        return QuackCounter.from(DuckCall.newInstance());
    }

    @Override
    public Quackable createRubberDuck() {
        return QuackCounter.from(RubberDuck.newInstance());
    }

    @Override
    public Quackable createGooseDuck() {
        throw new IllegalCallerException();
    }

}

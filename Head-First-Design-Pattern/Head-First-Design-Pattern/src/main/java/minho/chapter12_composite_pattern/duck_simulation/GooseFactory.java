package minho.chapter12_composite_pattern.duck_simulation;

public class GooseFactory extends AbstractDuckFactory {

    @Override
    public Quackable createMallardDuck() {
        throw new IllegalCallerException();
    }

    @Override
    public Quackable createRedheadDuck() {
        throw new IllegalCallerException();
    }

    @Override
    public Quackable createDuckCall() {
        throw new IllegalCallerException();
    }

    @Override
    public Quackable createRubberDuck() {
        throw new IllegalCallerException();
    }

    @Override
    public Quackable createGooseDuck() {
        return GooseAdapter.from(new Goose());
    }
}

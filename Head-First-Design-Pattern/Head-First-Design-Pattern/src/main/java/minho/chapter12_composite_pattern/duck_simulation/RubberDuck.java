package minho.chapter12_composite_pattern.duck_simulation;

public class RubberDuck implements Quackable {

    Observable observable;

    private RubberDuck() {
        this.observable = Observable.from(this);
    }

    public static RubberDuck newInstance() {
        return new RubberDuck();
    }

    @Override
    public void quack() {
        System.out.println("삑삑");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public String toString() {
        return "고무 오리";
    }

}

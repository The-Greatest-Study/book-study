package minho.chapter12_composite_pattern.duck_simulation;

public class RedheadDuck implements Quackable {

    Observable observable;

    private RedheadDuck() {
        observable = Observable.from(this);
    }

    public static RedheadDuck newInstance() {
        return new RedheadDuck();
    }

    @Override
    public void quack() {
        System.out.println("꽥꽥");
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
        return "붉은머리오리";
    }
}

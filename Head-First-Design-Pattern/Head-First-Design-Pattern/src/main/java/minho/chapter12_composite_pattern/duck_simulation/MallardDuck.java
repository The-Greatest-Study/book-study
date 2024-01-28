package minho.chapter12_composite_pattern.duck_simulation;

public class MallardDuck implements Quackable {

    Observable observable;

    private MallardDuck() {
        observable = Observable.from(this);
    }

    public static MallardDuck newInstance() {
        return new MallardDuck();
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
        return "물오리";
    }
}

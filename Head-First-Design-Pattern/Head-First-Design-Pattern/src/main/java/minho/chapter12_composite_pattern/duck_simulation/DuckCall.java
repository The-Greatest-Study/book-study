package minho.chapter12_composite_pattern.duck_simulation;

public class DuckCall implements Quackable{

    Observable observable;

    private DuckCall() {
        this.observable = Observable.from(this);
    }

    public static DuckCall newInstance () {
        return new DuckCall();
    }

    @Override
    public void quack() {
        System.out.println("꽉꽉");
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
        return "오리 호출기";
    }
}

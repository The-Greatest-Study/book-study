package minho.chapter12_composite_pattern.duck_simulation;

public class GooseAdapter implements Quackable {

    Goose goose;
    Observable observable;

    private GooseAdapter(Goose goose) {
        this.goose = goose;
        this.observable = Observable.from(this);
    }

    public static GooseAdapter from(Goose goose) {
        return new GooseAdapter(goose);
    }

    @Override
    public void quack() {
        goose.honk();
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
        return "거위";
    }

}

package minho.chapter12_composite_pattern.duck_simulation;

public interface QuackObservable {

    void registerObserver(Observer observer);

    void notifyObservers();
}

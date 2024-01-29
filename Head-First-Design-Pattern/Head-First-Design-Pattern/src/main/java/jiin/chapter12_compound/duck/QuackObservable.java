package jiin.chapter12_compound.duck;

public interface QuackObservable {
    void registerObserver(Observer observer);

    void notifyObservers();
}

package minho.chapter12_composite_pattern.duck_simulation;

import java.util.ArrayList;
import java.util.List;

public class Observable implements QuackObservable {

    List<Observer> observers = new ArrayList<>();
    QuackObservable duck;

    private Observable(QuackObservable duck) {
        this.duck = duck;
    }

    public static Observable from(QuackObservable duck) {
        return new Observable(duck);
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observers) {
            observer.update(duck);
        }
    }

}

package jiin.chapter12_compound.duck;

import java.util.ArrayList;
import java.util.List;

public class Observable implements QuackObservable {
    List<Observer> observerList = new ArrayList<>();
    QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update(duck);
        }
    }
}

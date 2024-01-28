package jiin.chapter12_compound.duck;

import java.util.ArrayList;
import java.util.List;

public class Flock implements Quackable {
    List<Quackable> quackerList = new ArrayList<>();

    public void add(Quackable quacker) {
        quackerList.add(quacker);
    }

    @Override
    public void quack() {
        quackerList.forEach(Quackable::quack);
    }

    @Override
    public void registerObserver(Observer observer) {
        for (Quackable quacker : quackerList) {
            quacker.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {}
}

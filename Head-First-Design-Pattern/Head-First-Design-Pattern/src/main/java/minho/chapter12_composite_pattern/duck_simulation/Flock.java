package minho.chapter12_composite_pattern.duck_simulation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flock implements Quackable {

    List<Quackable> quackers = new ArrayList<>();

    private Flock() {}

    public static Flock newInstance() {
        return new Flock();
    }

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    public void addQuackers(List<Quackable> quackers) {
        this.quackers.addAll(quackers);
    }

    /*
     * 반복자 패턴
     */
    @Override
    public void quack() {
        Iterator<Quackable> iterator = quackers.iterator();
        while (iterator.hasNext()) {
            iterator.next().quack();
        }

        // 향상된 for문을 사용해도 무관
        //        for(Quackable quacker : quackers) {
        //            quacker.quack();
        //        }
    }

    @Override
    public void registerObserver(Observer observer) {
        for (Quackable duck : quackers) {
            duck.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {
        // 각 오리에서 호출하므로 생략
    }
}

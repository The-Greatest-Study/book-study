package jihong.chapter12_MVC.Duck;

import jihong.chapter12_MVC.Observable.Observable;
import jihong.chapter12_MVC.Observable.Observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flock implements Quackable{

    List<Quackable> quackers = new ArrayList<Quackable>();

    public void add(Quackable duck){
        quackers.add(duck);
    }

    @Override
    public void quack() {
        Iterator<Quackable> iterator = quackers.iterator();
        while(iterator.hasNext()){
            Quackable duck = iterator.next();
            duck.quack();
        }
    }



    @Override
    public void registerObserver(Observer observer) {
        Iterator<Quackable> iterator = quackers.iterator();
        while(iterator.hasNext()){
            Quackable duck = iterator.next();
            duck.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {

    }
}

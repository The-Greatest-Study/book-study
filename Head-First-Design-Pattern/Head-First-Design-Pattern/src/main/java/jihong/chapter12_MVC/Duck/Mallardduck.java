package jihong.chapter12_MVC.Duck;

import jihong.chapter12_MVC.Observable.Observable;
import jihong.chapter12_MVC.Observable.Observer;

public class Mallardduck implements Quackable {
    Observable observable;

    public Mallardduck() {
        observable = new Observable(this);
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
}

package jihong.chapter12_MVC.Duck;

import jihong.chapter12_MVC.Observable.Observable;
import jihong.chapter12_MVC.Observable.Observer;

public class RedheadDuck implements Quackable {
    Observable observable;

    @Override
    public void quack() {
        System.out.println("꽥꽥");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {}

    @Override
    public void notifyObservers() {}
}

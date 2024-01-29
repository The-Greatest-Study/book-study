package jihong.chapter12_MVC.Adapter;

import jihong.chapter12_MVC.Duck.Goose;
import jihong.chapter12_MVC.Duck.Quackable;
import jihong.chapter12_MVC.Observable.Observable;
import jihong.chapter12_MVC.Observable.Observer;

public class GooseAdapter implements Quackable {
    Goose goose;

    Observable observable;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }

    @Override
    public void registerObserver(Observer observer) {}

    @Override
    public void notifyObservers() {}
}

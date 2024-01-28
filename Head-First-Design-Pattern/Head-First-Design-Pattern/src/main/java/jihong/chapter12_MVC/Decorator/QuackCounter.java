package jihong.chapter12_MVC.Decorator;

import jihong.chapter12_MVC.Duck.Quackable;
import jihong.chapter12_MVC.Observable.Observable;
import jihong.chapter12_MVC.Observable.Observer;
import lombok.AllArgsConstructor;
import lombok.Getter;

//데코레이터
@Getter
public class QuackCounter implements Quackable {
    private Quackable duck;
    private static int numberOfQuacks;

    public QuackCounter(Quackable duck){
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    @Override
    public void registerObserver(Observer observer) {
        duck.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        duck.notifyObservers();
    }
}

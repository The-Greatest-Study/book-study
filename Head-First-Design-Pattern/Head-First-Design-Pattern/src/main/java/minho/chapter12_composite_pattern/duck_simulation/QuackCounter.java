package minho.chapter12_composite_pattern.duck_simulation;

public class QuackCounter implements Quackable {

    Quackable duck;
    static int numberOfQuacks; // 모든 객체에서 소리낸 횟수를 세기 위한 정적 변수

    private QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    public static QuackCounter from(Quackable duck) {
        return new QuackCounter(duck);
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    public static int getQuacks() {
        return numberOfQuacks;
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

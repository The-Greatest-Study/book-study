package minji.chapter12_compositePattern.duckSimulator;

public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("꽥괙학자: " + duck + " 가 방금 소리냈다.");
    }
}

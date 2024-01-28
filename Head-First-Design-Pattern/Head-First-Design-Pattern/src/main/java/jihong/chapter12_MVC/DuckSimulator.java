package jihong.chapter12_MVC;

import jihong.chapter12_MVC.Adapter.GooseAdapter;
import jihong.chapter12_MVC.Decorator.QuackCounter;
import jihong.chapter12_MVC.Duck.Flock;
import jihong.chapter12_MVC.Duck.Goose;
import jihong.chapter12_MVC.Duck.Quackable;
import jihong.chapter12_MVC.Factory.AbstractDuckFactory;
import jihong.chapter12_MVC.Factory.CountingDuckFactory;
import jihong.chapter12_MVC.Observable.Quackologist;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);
    }

    private void simulate(AbstractDuckFactory duckFactory){
        Quackable redheadDuck =duckFactory.createRedheadDuck();
        Quackable duckCall =duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("\n오리 시뮬레이션 게임: 무리 (+컴포지트)");

        Flock flockOfDucks = new Flock();

        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        Flock flockOfMallards = new Flock();
        Quackable mallarDuckOne = duckFactory.createMallarDuck();
        Quackable mallarDuckTwo = duckFactory.createMallarDuck();
        Quackable mallarDuckThree = duckFactory.createMallarDuck();
        Quackable mallarDuckFour = duckFactory.createMallarDuck();

        flockOfMallards.add(mallarDuckOne);
        flockOfMallards.add(mallarDuckTwo);
        flockOfMallards.add(mallarDuckThree);
        flockOfMallards.add(mallarDuckFour);

        flockOfDucks.add(flockOfMallards);

        System.out.println("\n오리 시뮬레이션 게임: 전체 무리");
        simulate(flockOfDucks);

        System.out.println("\n오리 시뮬레이션 게임: 물오리 무리");
        simulate(flockOfMallards);

        System.out.println("\n오리 시뮬레이션 게임 (+옵저버)");
        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);

        simulate(flockOfDucks);

//        System.out.println("오리가 소리 낸 횟수: " + QuackCounter.class + " 번");
    }

    private void simulate(Quackable duck){
        duck.quack();
    }
}

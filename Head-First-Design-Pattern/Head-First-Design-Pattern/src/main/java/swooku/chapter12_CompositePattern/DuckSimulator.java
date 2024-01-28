package swooku.chapter12_CompositePattern;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory) {
        Quackable redhedDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        Quackable mallardDuckOne = duckFactory.createMallardDuck();
        Quackable mallardDuckTwo = duckFactory.createMallardDuck();
        Quackable mallardDuckThree = duckFactory.createMallardDuck();
        Quackable mallardDuckFour = duckFactory.createMallardDuck();

        System.out.println("\n오리 시뮬레이션 게임 (+컴포지트)");

        Flock flockOfDucks = new Flock();

        flockOfDucks.add(redhedDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        Flock flockOfMallards = new Flock();

        flockOfMallards.add(mallardDuckOne);
        flockOfMallards.add(mallardDuckTwo);
        flockOfMallards.add(mallardDuckThree);
        flockOfMallards.add(mallardDuckFour);

        flockOfDucks.add(flockOfMallards);

        System.out.println("\n오리 시뮬레이션 게임: 전체 무리");
        simulate(flockOfDucks);
        System.out.println("\n오리 시뮬레이션 게임: 물오리 무리");
        simulate(flockOfMallards);

        System.out.println("\n오리 시뮬레이션 게임 (+옵저버)");
        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);

        simulate(flockOfDucks);

        System.out.println("오리가 소리 낸 횟수: " + QuackCounter.getQuacks() + " 번");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}

package minho.chapter12_composite_pattern.duck_simulation;

import java.util.Arrays;

public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        AbstractDuckFactory gooseFactory = new GooseFactory();

        simulator.simulate(duckFactory, gooseFactory);
    }

    private void simulate(AbstractDuckFactory duckFactory, AbstractDuckFactory gooseFactory) {
        Flock flockOfDucks = Flock.newInstance();
        flockOfDucks.addQuackers(Arrays.asList(duckFactory.createRedheadDuck(),
                duckFactory.createDuckCall(),
                duckFactory.createRubberDuck(),
                gooseFactory.createGooseDuck()));

        // 물오리 무리
        Flock flockOfMallards = Flock.newInstance();
        flockOfMallards.addQuackers(Arrays.asList(duckFactory.createMallardDuck(),
                duckFactory.createMallardDuck(),
                duckFactory.createMallardDuck(),
                duckFactory.createMallardDuck()));

        // 물오리 무리를 오리 무리에 넣습니다.
        flockOfDucks.add(flockOfMallards);

        System.out.println("\n오리 시뮬레이션 게임: 전체 무리");
        simulate(flockOfDucks);

        System.out.println("\n오리 시뮬레이션 게임: 물오리 무리");
        simulate(flockOfMallards);

        System.out.println("\n오리 시뮬레이션 게임 + 옵저버");
        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);
        simulate(flockOfDucks);

        System.out.println("\n오리가 소리 낸 횟수: " + QuackCounter.getQuacks());
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }

}

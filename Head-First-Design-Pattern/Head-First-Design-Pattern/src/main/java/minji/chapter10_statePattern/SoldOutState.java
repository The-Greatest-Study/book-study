package minji.chapter10_statePattern;

public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("매진되었습니다. 다음에 이용해주세요.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("동전을 반환할 수 없습니다. 동전을 넣지 않았습니다.");
    }

    @Override
    public void turnCrank() {
        System.out.println("매진되었습니다. 다음에 이용해주세요.");
    }

    @Override
    public void dispense() {
        System.out.println("매진되었습니다. 다음에 이용해주세요.");
    }

    @Override
    public void refill(int count) {
        gumballMachine.refillBalls(count);
    }
}

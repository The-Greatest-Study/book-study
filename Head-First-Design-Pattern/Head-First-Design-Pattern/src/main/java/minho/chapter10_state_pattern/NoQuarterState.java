package minho.chapter10_state_pattern;

public class NoQuarterState implements State {

    private static final long serialVersionUID = 2L;
    transient GumballMachine gumballMachine;

    private NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public static NoQuarterState from(GumballMachine gumballMachine) {
        return new NoQuarterState(gumballMachine);
    }

    @Override
    public void insertQuarter() {
        System.out.println("동전을 넣으셨습니다.");
        gumballMachine.updateState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("동전을 넣어 주세요");
    }

    @Override
    public void turnCrank() {
        System.out.println("동전을 넣어 주세요");
    }

    @Override
    public void dispense() {
        System.out.println("동전을 넣어 주세요");
    }

    @Override
    public void refill() {}
}

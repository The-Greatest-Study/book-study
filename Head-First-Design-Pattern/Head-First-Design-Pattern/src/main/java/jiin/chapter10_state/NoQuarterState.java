package jiin.chapter10_state;

public class NoQuarterState implements GumballMachineState {
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void refill(int count) {
        gumballMachine.addGumballs(count);
        System.out.println("알맹이를 리필했습니다.");
    }

    @Override
    public void insertQuarter() {
        System.out.println("동전을 넣으셨습니다.");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("동전을 넣어 주세요.");
    }

    @Override
    public void turnCrank() {
        System.out.println("동전을 넣어주세요.");
    }

    @Override
    public void dispense() {
        System.out.println("동전을 넣어주세요.");
    }

    @Override
    public String toString() {
        return "동전 투입 대기 중";
    }
}

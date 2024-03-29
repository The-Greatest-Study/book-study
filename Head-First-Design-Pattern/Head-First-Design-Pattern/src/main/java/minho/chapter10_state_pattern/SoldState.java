package minho.chapter10_state_pattern;

public class SoldState implements State {

    GumballMachine gumballMachine;

    private SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public static SoldState from(GumballMachine gumballMachine) {
        return new SoldState(gumballMachine);
    }

    @Override
    public void insertQuarter() {
        System.out.println("알맹이를 내보내고 있습니다.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("이미 알맹이를 뽑으셨습니다.");
    }

    @Override
    public void turnCrank() {
        System.out.println("손잡이는 한 번만 돌려 주세요.");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.hasStock()) {
            gumballMachine.updateState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("매진 되었습니다..");
            gumballMachine.updateState(gumballMachine.getSoldOutState());
        }
    }

    @Override
    public void refill() {}
}

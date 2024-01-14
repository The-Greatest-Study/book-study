package minho.chapter10_state_pattern;

public class WinnerState implements State{

    GumballMachine gumballMachine;

    private WinnerState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    public static WinnerState from(GumballMachine gumballMachine) {
        return new WinnerState(gumballMachine);
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
        if(gumballMachine.outOfStock()) {
            gumballMachine.updateState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseBall();
            System.out.println("축하드립니다. 알맹이를 하나 더 받으실 수 있습니다.");
            if(gumballMachine.hasStock()) {
                gumballMachine.updateState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("더 이상 알맹이가 없습니다.");
                gumballMachine.updateState(gumballMachine.getSoldOutState());
            }
        }
    }

    @Override
    public void refill() {

    }

}

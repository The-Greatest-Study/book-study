package jihong.chapter10_Status;

public class NoQuarterState implements State {
    private static final long serialversionUID = 2L;
    transient GumballMachine gumballMachine; //직렬화를 하지 않음

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
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
        System.out.println("동전을 넣어 주세요.");
    }

    @Override
    public void dispense() {
        System.out.println("동전을 넣어 주세요.");
    }
}

package jiin.chapter10_state;

import lombok.Getter;
import lombok.Setter;

@Getter
public class GumballMachine {
    GumballMachineState soldOutState;
    GumballMachineState noQuarterState;
    GumballMachineState hasQuarterState;
    GumballMachineState soldState;
    GumballMachineState winnerState;

    @Setter GumballMachineState state;
    int count = 0;

    public GumballMachine(int newGumballs) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);

        this.count = newGumballs;

        if (newGumballs > 0) {
            state = noQuarterState;
        } else {
            state = soldOutState;
        }
    }

    public void addGumballs(int count) {
        this.count += count;
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void releaseBall() {
        System.out.println("알맹이를 내보내고 있습니다.");
        if (count > 0) {
            count -= 1;
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("자바로 돌아가는 최신형 뽑기 기계\n");
        stringBuffer.append("남은 개수: ");
        stringBuffer.append(count);
        stringBuffer.append("개\n");
        stringBuffer.append(state);
        stringBuffer.append("\n");

        return stringBuffer.toString();
    }
}

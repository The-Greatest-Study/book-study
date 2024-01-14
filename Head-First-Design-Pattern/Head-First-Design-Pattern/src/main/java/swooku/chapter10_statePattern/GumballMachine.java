package swooku.chapter10_statePattern;

import lombok.Getter;
import swooku.chapter10_statePattern.StateType.*;

@Getter
public class GumballMachine {
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;

    State state;
    int count = 0;

    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noQuarterState;
        } else {
            state = soldOutState;
        }
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

    public void setState(State state) {
        this.state = state;
    }

    public void releaseBall() {
        System.out.println("알멩이를 내보내고 있습니다.");
        if (count > 0) {
            count = count - 1;
        }
    }

    @Override
    public String toString() {
        return "\n주식회사 왕뽑기"
                + "\n자바로 돌아가는 최신형 뽑기 기계"
                + "\n남은 개수 : "
                + this.count
                + "개"
                + "\n동전 투입 대기중\n";
    }
}

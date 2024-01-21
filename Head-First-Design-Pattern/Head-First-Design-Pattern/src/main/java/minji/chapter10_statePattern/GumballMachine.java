package minji.chapter10_statePattern;

import java.io.Serial;
import java.rmi.*;
import java.rmi.server.*;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {
    @Serial private static final long serialVersionUID = 2L;

    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;

    State state;
    int count;
    String location;

    public GumballMachine(int count, String location) throws RemoteException {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);

        this.count = count;
        this.location = location;
        if (count > 0) {
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

    void setState(State state) {
        this.state = state;
    }

    void releaseBall() {
        System.out.println("알맹이를 내보내고 있습니다.");
        if (count > 0) {
            count -= 1;
        }
    }

    void refillBalls(int refillCount) {
        if (state == getSoldOutState()) {
            count += refillCount;
            System.out.println("알맹이가 채워졌습니다. 남은 알맹이 수 : " + count);
        }
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public State getState() {
        return state;
    }

    public int getCount() {
        return count;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "GumballMachine{" + "state=" + state + ", count=" + count + '}';
    }
}

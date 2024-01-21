package jihong.chapter10_Status;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import jihong.chapter11_Proxy.GumballMachineRemote;
import lombok.Getter;
import lombok.Setter;

@Getter
public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {

    private static final long serialVersionUID = 2L;
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;
    String location;

    @Setter State state = soldOutState;
    int count = 0;

    public GumballMachine(String location, int count) throws RemoteException {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);

        this.count = count;
        if (count > 0) {
            state = noQuarterState;
        } else {
            state = soldOutState;
        }

        this.location = location;
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
            count--;
        }
    }

    public void refill(int count) {
        this.count += count;
        System.out.println("알맹이가 채워졌습니다. 남은 알맹이 수 : " + this.count);
        state.refill();
    }
}

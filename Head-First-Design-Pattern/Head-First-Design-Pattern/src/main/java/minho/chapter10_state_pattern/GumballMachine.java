package minho.chapter10_state_pattern;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import lombok.Getter;
import minho.chapter11_proxy_pattern.remote_proxy.GumballMachineRemote;

@Getter
public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {

    private static final long serialVersionUID = 2L;

    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;

    State state;
    int count = 0;
    String location;

    private GumballMachine(String location, int numberOfGumballs) throws RemoteException {
        noQuarterState = NoQuarterState.from(this);
        hasQuarterState = HasQuarterState.from(this);
        soldState = SoldState.from(this);
        soldOutState = SoldOutState.from(this);
        winnerState = WinnerState.from(this);

        this.count = numberOfGumballs;
        if (numberOfGumballs > 0) {
            state = noQuarterState;
        } else {
            state = soldOutState;
        }

        this.location = location;
    }

    public static GumballMachine create(String location, int count) throws RemoteException {
        return new GumballMachine(location, count);
    }

    public void insertQuarter() {
        //        if (state == HAS_QUARTER) {
        //            System.out.println("동전은 한 개만 넣어 주세요.");
        //        } else if(state == NO_QUARTER) {
        //            System.out.println("동전을 넣으셨습니다.");
        //            state = HAS_QUARTER;
        //        } else if(state == SOLD_OUT) {
        //            System.out.println("매진되었습니다. 다음 기회에 이용해 주세요.");
        //        } else if(state == SOLD) {
        //            System.out.println("알맹이를 내보내고 있습니다.");
        //        }
        state.insertQuarter();
    }

    public void ejectQuarter() {
        //        if (state == HAS_QUARTER) {
        //            System.out.println("동전이 반환됩니다.");
        //            state = NO_QUARTER;
        //        } else if(state == NO_QUARTER) {
        //            System.out.println("동전을 넣어주세요.");
        //        } else if(state == SOLD_OUT) {
        //            System.out.println("이미 알맹이를 뽑으셨습니다.");
        //        } else if(state == SOLD) {
        //            System.out.println("동전을 넣지 않으셨습니다. 동전이 반환되지 않습니다.");
        //        }
        state.ejectQuarter();
    }

    public void turnCrank() {
        //        if (state == HAS_QUARTER) {
        //            System.out.println("손잡이를 돌리셨습니다.");
        //            state = SOLD;
        //            dispense();
        //        } else if(state == NO_QUARTER) {
        //            System.out.println("동전을 넣어주세요.");
        //        } else if(state == SOLD_OUT) {
        //            System.out.println("매진되었습니다.");
        //        } else if(state == SOLD) {
        //            System.out.println("손잡이는 한 번만 돌려 주세요.");
        //        }
        state.turnCrank();
        state.dispense();
    }

    //    public void dispense() {
    //        if (state == HAS_QUARTER) {
    //            System.out.println("알맹이를 내보낼 수 없습니다.");
    //        } else if(state == NO_QUARTER) {
    //            System.out.println("동전을 넣어주세요.");
    //        } else if(state == SOLD_OUT) {
    //            System.out.println("매진되었습니다.");
    //        } else if(state == SOLD) {
    //            System.out.println("알맹이를 내보내고 있습니다.");
    //            count -= 1;
    //            if(count == 0) {
    //                System.out.println("더 이상 알맹이가 없습니다.");
    //                state = SOLD_OUT;
    //            } else {
    //                state = NO_QUARTER;
    //            }
    //        }
    //    }

    public void releaseBall() {
        System.out.println("알맹이를 내보내고 있습니다.");
        if (count > 0) {
            count = count - 1;
        }
    }

    @Override
    public String toString() {
        return "\n주식회사 왕뽑기\n자바로 돌아가는 최신형 뽑기 기계\n남은 개수 " + count + "개\n동전 투입 대기중\n";
    }

    public void updateState(State state) {
        this.state = state;
    }

    public boolean hasStock() {
        return count > 0;
    }

    public boolean outOfStock() {
        return !hasStock();
    }

    public boolean hasWinningStock() {
        return count > 1;
    }

    public void refill(int count) {
        this.count += count;
        System.out.println(count + "개의 알맹이가 채워졌습니다.");
        state.refill();
    }
}

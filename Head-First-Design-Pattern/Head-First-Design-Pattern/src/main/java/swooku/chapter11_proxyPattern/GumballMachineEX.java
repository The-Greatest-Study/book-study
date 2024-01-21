package swooku.chapter11_proxyPattern;

public class GumballMachineEX {
    static final int SOLD_OUT = 0;
    static final int NO_QUARTER = 1;
    static final int HAS_QUARTER = 2;
    static final int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;

    public GumballMachineEX(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    public void insertQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("동전은 한 개만 넣어주세요.");
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("동전을 넣으셨습니다.");
        } else if (state == SOLD_OUT) {
            System.out.println("매진되었습니다. 다음 기회에 이용해주세요.");
        } else if (state == SOLD) {
            System.out.println("알맹이를 내보내고 있습니다.");
        }
    }

    public void ejectQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("동전이 반환됩니다.");
            state = NO_QUARTER;
        } else if (state == NO_QUARTER) {
            System.out.println("동전을 넣어주세요.");
        } else if (state == SOLD) {
            System.out.println("이미 알맹이를 뽑으셨습니다.");
        } else if (state == SOLD_OUT) {
            System.out.println("동전을 넣지 않으셨습니다. 동전이 반환되지 않습니다.");
        }
    }

    public void turnCrank() {
        if (state == SOLD) {
            System.out.println("손잡이는 한 번만 돌려주세요.");
        } else if (state == NO_QUARTER) {
            System.out.println("동전을 넣어 주세요.");
        } else if (state == SOLD_OUT) {
            System.out.println("매진되었습니다.");
        } else if (state == HAS_QUARTER) {
            System.out.println("손잡이를 돌리셨습니다.");
            state = SOLD;
            dispense();
        }
    }

    public void dispense() {
        if (state == SOLD) {
            System.out.println("알맹이를 내보내고 있습니다.");
            count = count - 1;
            if (count == 0) {
                System.out.println("더 이상 알맹이가 없습니다.");
                state = SOLD_OUT;
            } else {
                state = NO_QUARTER;
            }
        } else if (state == NO_QUARTER) {
            System.out.println("동전을 넣어주세요.");
        } else if (state == SOLD_OUT) {
            System.out.println("매진입니다.");
        } else if (state == HAS_QUARTER) {
            System.out.println("알맹이를 내보낼 수 없습니다.");
        }
    }

    // toString()과 refill() 같은 기타 메소드

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

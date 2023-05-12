package minji.chapter05_singletonPattern;

public class ChocolateBoilerVolatile {
    private boolean empty;
    private boolean boiled;

    // DCL (Double Check Locking)을 사용하는 방법
    // DCL 이란: 인스턴스가 생성되어 있는지 확인하고, 생성되어 있지 않았을때만 동기화 진행
    private static volatile ChocolateBoilerVolatile chocolateBoilerVolatile;

    private ChocolateBoilerVolatile() {
        empty = true;
        boiled = false;
    }

    // getChocolateBoiler 메서드에 synchronized 키워드를 사용하여
    // 매번 ChocolateBoiler에 접근할때마다 싱글턴객체가 두개 생성되었는지 체크하는 방식
    public static ChocolateBoilerVolatile getChocolateBoiler() {
        if (chocolateBoilerVolatile == null) {
            // 동기화 블럭으로 진입
            synchronized (ChocolateBoilerVolatile.class) {
                chocolateBoilerVolatile = new ChocolateBoilerVolatile();
            }
        }
        return chocolateBoilerVolatile;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}

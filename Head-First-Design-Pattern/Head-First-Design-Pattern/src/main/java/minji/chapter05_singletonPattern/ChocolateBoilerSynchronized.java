package minji.chapter05_singletonPattern;

public class ChocolateBoilerSynchronized {
    private boolean empty;
    private boolean boiled;

    private static ChocolateBoilerSynchronized chocolateBoilerSynchronized;

    private ChocolateBoilerSynchronized() {
        empty = true;
        boiled = false;
    }

    // getChocolateBoiler 메서드에 synchronized 키워드를 사용하여
    // 매번 ChocolateBoiler에 접근할때마다 싱글턴객체가 두개 생성되었는지 체크하는 방식
    public static synchronized ChocolateBoilerSynchronized getChocolateBoiler() {
        if (chocolateBoilerSynchronized == null) {
            chocolateBoilerSynchronized = new ChocolateBoilerSynchronized();
        }
        return chocolateBoilerSynchronized;
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

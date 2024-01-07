package swooku.chapter05_singletonPattern;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    // private static ChocolateBoiler uniqueInstance;
    // private static ChocolateBoiler uniqueInstance = new ChocolateBoiler();
    private static volatile ChocolateBoiler uniqueInstance;

    public static ChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            synchronized (ChocolateBoiler.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new ChocolateBoiler();
                }
            }
        }
        return uniqueInstance;
    }

    private ChocolateBoiler() {
        empty = true;
        boiled = true;
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

    @Override
    public String toString() {
        System.out.println("empty: " + empty + ", boiled: " + boiled);
        return "empty: " + empty + ", boiled: " + boiled;
    }
}

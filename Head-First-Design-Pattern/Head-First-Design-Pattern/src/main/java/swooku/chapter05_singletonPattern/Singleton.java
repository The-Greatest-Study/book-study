package swooku.chapter05_singletonPattern;

public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {}

    // Lazyinstantiation
    public static Singleton getInstance() {
        if(uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
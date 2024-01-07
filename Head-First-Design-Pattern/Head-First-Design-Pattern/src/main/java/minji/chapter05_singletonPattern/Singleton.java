package minji.chapter05_singletonPattern;

public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {}
    ;

    public static synchronized Singleton getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}

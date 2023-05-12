package minji.chapter05_singletonPattern;

public class ChocolateBoilerInstantiation {
    private boolean empty;
    private boolean boiled;

    // 클래스가 로딩될때 JVM에서 싱글턴 객체를 생성하도록 코드상으로 생성자를 기입하는 방식
    private static ChocolateBoilerInstantiation chocolateBoilerInstantiation
            = new ChocolateBoilerInstantiation();

    private ChocolateBoilerInstantiation() {
        empty = true;
        boiled = false;
    }

    // 이미 객체가 생성되었으니 null 여부 확인이 필요없이 바로 객체 return
    public static synchronized ChocolateBoilerInstantiation getChocolateBoiler() {
        return chocolateBoilerInstantiation;
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

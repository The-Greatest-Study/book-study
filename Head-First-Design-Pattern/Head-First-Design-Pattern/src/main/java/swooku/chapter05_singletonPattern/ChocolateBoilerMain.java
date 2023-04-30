package swooku.chapter05_singletonPattern;

public class ChocolateBoilerMain {
    
    public static void main(String[] args) {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        boiler.fill();
        boiler.toString();
        boiler.boil();
        boiler.toString();
        boiler.drain();
        boiler.toString();
    }
}

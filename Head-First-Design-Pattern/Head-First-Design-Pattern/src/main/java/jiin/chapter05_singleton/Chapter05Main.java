package jiin.chapter05_singleton;

public class Chapter05Main {
    public static void main(String[] args) {
        System.out.println("***** Singleton Class *****");
        ChocolateBoiler chocolateBoiler = ChocolateBoiler.getUniqueInstance();
        chocolateBoiler.fill();
        chocolateBoiler.boil();
        chocolateBoiler.drain();

        System.out.println("\n***** Singleton Enum *****");
        ChocolateBoilerEnum chocoEnum = ChocolateBoilerEnum.UNIQUE_INSTANCE;
        chocoEnum.boil(); // can not boil
        chocoEnum.fill();
        chocoEnum.boil();
        chocoEnum.drain();
    }
}

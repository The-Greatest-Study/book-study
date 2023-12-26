package swooku.chapter08_algorithm_encapsulation;

public class CoffeeOrderTest {
    public static void main(String[] args) {
        TeaWithHook teaHook = new TeaWithHook();
        CoffeeWithHook coffeeHook = new CoffeeWithHook();

        System.out.println("\n홍차 준비 중...");
        teaHook.prepareRecipe();

        System.out.println("\n커피 준비 중...");
        coffeeHook.prepareRecipe();
    }
}
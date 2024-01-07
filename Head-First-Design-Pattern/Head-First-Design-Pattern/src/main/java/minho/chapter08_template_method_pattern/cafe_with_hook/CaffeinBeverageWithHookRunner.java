package minho.chapter08_template_method_pattern.cafe_with_hook;

public class CaffeinBeverageWithHookRunner {

    public static void main(String[] args) {
        System.out.println("커피 준비하는 중");
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();
        coffeeWithHook.prepareRecipe();
    }
}

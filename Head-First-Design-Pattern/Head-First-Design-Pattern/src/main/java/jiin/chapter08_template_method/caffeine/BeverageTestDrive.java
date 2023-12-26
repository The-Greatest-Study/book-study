package jiin.chapter08_template_method.caffeine;

public class BeverageTestDrive {
    public static void main(String[] args) {
        CaffeineTea caffeineTea = new CaffeineTea();
        CaffeineCoffee caffeineCoffee = new CaffeineCoffee();
        CaffeineCoffeeWithHook caffeineCoffeeWithHook = new CaffeineCoffeeWithHook();

        System.out.println("\n그냥 차 준비 중...");
        caffeineTea.prepareRecipe();

        System.out.println("\n그냥 커피 준비 중...");
        caffeineCoffee.prepareRecipe();

        System.out.println("\n커스터마이징 할 수 있는 커피 준비 중...");
        caffeineCoffeeWithHook.prepareRecipe();
    }
}

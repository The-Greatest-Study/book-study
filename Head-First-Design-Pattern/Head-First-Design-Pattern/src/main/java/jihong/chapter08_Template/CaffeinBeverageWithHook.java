package jihong.chapter08_Template;

public abstract class CaffeinBeverageWithHook {

    final void prepareRecipe() {
        boildWater();
        brew();
        pourInCup();

        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    // hoke 메소드: 필요할 때 구현 가능
    private boolean customerWantsCondiments() {
        return true;
    }

    abstract void brew();

    abstract void addCondiments();

    void boildWater() {
        System.out.println("물 끓이는 중");
    }

    public void pourInCup() {
        System.out.println("컵에 따르는 중");
    }
}

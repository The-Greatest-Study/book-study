package minho.chapter08_template_method_pattern.cafe_with_hook;

public abstract class CaffeinBeverageWithHook {

    final void prepareRecipe() {
        this.boilWater();
        this.brew();
        this.popInCup();
        if (this.customerWantsCondinents()) {
            this.addCondiments();
        }
    }

    boolean customerWantsCondinents() {
        return true;
    }

    abstract void addCondiments();

    void popInCup() {
        System.out.println("컵에 따르는 중");
    }

    abstract void brew();

    void boilWater() {
        System.out.println("물 끓이는 중");
    }
}

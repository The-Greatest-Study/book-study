package minho.chapter08_template_method_pattern.cafe;

public abstract class CaffeinBeverage {

    final void prepareRecipe() {
        this.boilWater();
        this.brew();
        this.popInCup();
        this.addCondiments();
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

package jiin.chapter08_template_method.caffeine;

public abstract class CaffeineBeverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()){
            addCondiments();
        }
    }

    private void boilWater() {
        System.out.println("물 끓이는 중");
    }

    abstract void brew();

    private void pourInCup() {
        System.out.println("컵에 따르는 중");
    }

    protected boolean customerWantsCondiments(){
        return true;
    }

    abstract void addCondiments();
}

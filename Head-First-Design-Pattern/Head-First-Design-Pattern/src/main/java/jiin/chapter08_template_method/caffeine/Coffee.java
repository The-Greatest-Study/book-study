package jiin.chapter08_template_method.caffeine;

public class Coffee {
    void prepareRecipe() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMild();
    }

    public void boilWater() {
        System.out.println("물 긇이는 중");
    }

    public void brewCoffeeGrinds() {
        System.out.println("필터로 커피를 우려내는 중");
    }

    public void pourInCup() {
        System.out.println("컵에 따르는 중");
    }

    public void addSugarAndMild() {
        System.out.println("설탕과 우유를 추가하는 중");
    }
}

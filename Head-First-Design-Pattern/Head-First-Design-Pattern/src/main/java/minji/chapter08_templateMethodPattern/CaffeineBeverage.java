package minji.chapter08_templateMethodPattern;

public abstract class CaffeineBeverage {
    // Interface 대신 Abstract를 쓰는 이유?
    // 1. Abstract는 클래스 내에 일부 특정 메소드만 override 할수있도록 정의할수 있다
    // |__ 1.1 공통적으로 구현되는 메소드는 abstract class 내에서 구현할 수 있다
    // 2. private 또는 protected class를 사용할 수 있다
    // 3. 필요시, abstract method가 interface를 implement 받는 형태로도 사용할 수 있다
    // 4. class 내에서 non-static한 멤버 변수를 사용할 수 있다 (실제 객체화 가능)

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    // 왜 여기다가 public을 안붙힐까?
    // public, private, protected 가 붙어있지 않으면 default로 package 설정이 적용됨
    // 같은 패키지 내에서만 참조를 가능하게 해서 상속을 받을수 있게 하기 위해서?
    abstract void brew();

    abstract void addCondiments();

    public void boilWater() {
        System.out.println("물 끓이는 중");
    }

    public void pourInCup() {
        System.out.println("컵에 따르는 중");
    }

    boolean customerWantsCondiments() {
        return true;
    }
}

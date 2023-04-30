package jiin.chapter05_singleton;

import lombok.Getter;

@Getter
public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private static final ChocolateBoiler uniqueInstance = new ChocolateBoiler();

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getUniqueInstance() {
        return uniqueInstance;
    }

    /**
     * 보일러에 우유와 초콜릿을 혼합한 재료를 넣는 method
     */
    public void fill() {
        if(isEmpty()){
            empty = false;
            boiled = false;
            System.out.println("filling milk and chocolate");
        }
    }

    /**
     * 재료를 끓이는 method
     */
    public void boil() {
        if(!isEmpty() && !isBoiled()) {
            boiled = true;
            System.out.println("boiling milk and chocolate");
        }
    }

    /**
     * 끓인 재료를 다음 단계로 넘기는 method
     */
    public void drain() {
        if(!isEmpty() && isBoiled()){
            empty = true;
            System.out.println("draining milk and chocolate");
        }
    }
}

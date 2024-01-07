package jiin.chapter05_singleton;

import lombok.Getter;

public enum ChocolateBoilerEnum {
    UNIQUE_INSTANCE(true, false);

    @Getter private boolean empty;
    @Getter private boolean boiled;

    private ChocolateBoilerEnum(boolean empty, boolean boiled) {
        this.empty = empty;
        this.boiled = boiled;
    }

    /**
     * 보일러에 우유와 초콜릿을 혼합한 재료를 넣는 method
     */
    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            System.out.println("[ChocolateBoilerEnum] filling milk and chocolate");
        }
    }

    /**
     * 재료를 끓이는 method
     */
    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
            System.out.println("[ChocolateBoilerEnum] boiling milk and chocolate");
        }
    }

    /**
     * 끓인 재료를 다음 단계로 넘기는 method
     */
    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
            System.out.println("[ChocolateBoilerEnum] draining milk and chocolate");
        }
    }
}

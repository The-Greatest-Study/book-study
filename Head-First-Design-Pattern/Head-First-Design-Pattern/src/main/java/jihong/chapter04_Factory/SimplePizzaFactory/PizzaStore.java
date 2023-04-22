package jihong.chapter04_Factory.SimplePizzaFactory;

import jihong.chapter04_Factory.Pizza.Pizza;

public class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory){
        this.factory = factory;
    }

    public Pizza orderPizza(String type){
        Pizza pizza;

        /* 팩토리 패턴을 이용하여 구상 클래스의 인스턴스를 만들지 않아도 됨 */
        pizza = factory.createPizza(type);

//        pizza.prepare();
        pizza.bake();
        pizza.box();

        return pizza;
    }
}

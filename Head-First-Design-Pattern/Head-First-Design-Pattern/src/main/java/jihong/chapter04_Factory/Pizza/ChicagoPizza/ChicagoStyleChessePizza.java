package jihong.chapter04_Factory.Pizza.ChicagoPizza;

import jihong.chapter04_Factory.Pizza.Pizza;

public class ChicagoStyleChessePizza extends Pizza {
    public ChicagoStyleChessePizza(){
        name = "시카고 스타일 딥 디쉬 치즈 피자";
        dough = "아주 두꺼운 크러스트 도우";
        sauce = "플럽토마토 소스";

        toppings.add("잘게 조각낸 모짜렐라 치즈");
    }

    public void cut(){
        System.out.println("네모난 모양으로 피자 자르기");
    }
}

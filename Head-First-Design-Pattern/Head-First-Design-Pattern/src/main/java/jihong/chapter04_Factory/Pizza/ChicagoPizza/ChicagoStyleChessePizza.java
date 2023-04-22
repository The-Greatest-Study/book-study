package jihong.chapter04_Factory.Pizza.ChicagoPizza;

import jihong.chapter04_Factory.Pizza.Pizza;

public class ChicagoStyleChessePizza extends Pizza {
    public ChicagoStyleChessePizza(){

    }

    @Override
    public void prepare() {

    }

    public void cut(){
        System.out.println("네모난 모양으로 피자 자르기");
    }
}

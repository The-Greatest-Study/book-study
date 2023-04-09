package jihong.chapter03_Decorator.Beverage;

import jihong.chapter03_Decorator.Beverage.Beverage;

public class DarkRost extends Beverage {
    public DarkRost(){
        description = "다크로스트 커피";
    }
    @Override
    public double cost() {
        return .99;
    }
}

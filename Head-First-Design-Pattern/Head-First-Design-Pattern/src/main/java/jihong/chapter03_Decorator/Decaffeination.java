package jihong.chapter03_Decorator;

public class Decaffeination extends Beverage{
    public Decaffeination(){
        description = "디카페인 커피";
    }
    @Override
    public double cost() {
        return 1.05;
    }
}

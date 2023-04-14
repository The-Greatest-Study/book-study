package minho.chapter03_decorator.Beverage;

public class HouseBlend extends Beverage{
    public HouseBlend(Size size){
        this.description = "하우스 블랜드 커피";
        this.size = size;
    }

    @Override
    public double cost() {
        return .89;
    }
}

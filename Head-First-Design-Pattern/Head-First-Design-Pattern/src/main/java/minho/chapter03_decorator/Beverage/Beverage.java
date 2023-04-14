package minho.chapter03_decorator.Beverage;

public abstract class Beverage {

    public enum Size{ TALL, GRANDE, VENTI };
    Size size = Size.TALL;

    public Size getSize() {
        return this.size;
    }

    public void setSize(Size size){
        this.size = size;
    }

    String description = "제목 없음";

    public String getDescription() {
        return this.description;
    }

    public abstract double cost();
}

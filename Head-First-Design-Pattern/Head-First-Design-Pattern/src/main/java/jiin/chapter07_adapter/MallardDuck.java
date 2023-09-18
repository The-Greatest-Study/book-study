package jiin.chapter07_adapter;

public class MallardDuck implements Duck{
    @Override
    public void quack() {
        System.out.println("꿱");
    }

    @Override
    public void fly() {
        System.out.println("날고 있어요!!");
    }
}

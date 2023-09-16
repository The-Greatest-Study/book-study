package swooku.chapter07_adapterPattern_facadePattern.Facade;

public class TheaterLights {
    public void on() {
        System.out.println("조명이 꺼졌습니다.");
    }

    public void dim(int i) {
        System.out.println("조명 밝기를 " + i + "%로 설정합니다.");
    }
}

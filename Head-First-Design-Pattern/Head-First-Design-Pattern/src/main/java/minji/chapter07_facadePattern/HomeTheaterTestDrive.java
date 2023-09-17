package minji.chapter07_facadePattern;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade();
        homeTheater.watchMovie("인디아나 존스:레이더스");
    }
}

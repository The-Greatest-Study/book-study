package swooku.chapter07_adapterPattern_facadePattern.Facade;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        // 구성 요소 초기화
        Amplifier amp = new Amplifier();
        Tuner tuner = new Tuner();
        StreamingPlayer player = new StreamingPlayer();
        Projector projector = new Projector();
        TheaterLights lights = new TheaterLights();
        Screen screen = new Screen();
        PopCornPopper popper = new PopCornPopper();

        HomeTheaterFacade homeTheater =
                new HomeTheaterFacade(amp, tuner, player, projector, lights, screen, popper);

        homeTheater.watchMovie("인디아나 존스:레이더스");
        homeTheater.endMovie();
    }
}

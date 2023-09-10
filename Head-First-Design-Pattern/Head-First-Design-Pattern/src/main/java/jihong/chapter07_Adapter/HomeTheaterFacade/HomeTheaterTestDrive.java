public class HomeTheaterTestDrive {
    public static void main(String[] args){
        HomeTheaterFacade homeTheater = new HmoeTheaterFacade(amp, tuner, player, proejctor, screen, lights, popper);

        //퍼사드패턴은 단순하게 인터페이스를 구현하여 사용할 수 있음
        homeTheater.watchMovie("인디아나 존스:레이더스");
        homeTheater.endMovie();
    }
}
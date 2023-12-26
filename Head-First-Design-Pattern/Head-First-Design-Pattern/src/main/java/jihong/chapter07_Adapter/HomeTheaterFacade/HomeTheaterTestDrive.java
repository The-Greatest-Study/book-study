package jihong.chapter07_Adapter.HomeTheaterFacade;

import jiin.chapter07_facade.Amplifier;
import jiin.chapter07_facade.CdPlayer;
import jiin.chapter07_facade.HomeTheaterFacade;
import jiin.chapter07_facade.PopcornPopper;
import jiin.chapter07_facade.Projector;
import jiin.chapter07_facade.Screen;
import jiin.chapter07_facade.StreamingPlayer;
import jiin.chapter07_facade.TheaterLights;
import jiin.chapter07_facade.Tuner;

public class HomeTheaterTestDrive {
    public static void main(String[] args){
        jiin.chapter07_facade.Amplifier amp = new Amplifier("Amplifier");
        jiin.chapter07_facade.Tuner tuner = new Tuner("AM/FM Tuner", amp);
        jiin.chapter07_facade.StreamingPlayer player = new StreamingPlayer("Streaming Player", amp);
        jiin.chapter07_facade.CdPlayer cd = new CdPlayer("CD Player", amp);
        jiin.chapter07_facade.Projector projector = new Projector("Projector", player);
        jiin.chapter07_facade.TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
        jiin.chapter07_facade.Screen screen = new Screen("Theater Screen");
        jiin.chapter07_facade.PopcornPopper popper = new PopcornPopper("Popcorn Popper");

        jiin.chapter07_facade.HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, player, projector, screen, lights, popper);

        //퍼사드패턴은 단순하게 인터페이스를 구현하여 사용할 수 있음
        homeTheater.watchMovie("인디아나 존스:레이더스");
        homeTheater.endMovie();
    }
}
package minji.chapter07_facadePattern;

import minji.chapter07_facadePattern.components.*;

public class HomeTheaterFacade {

    Amplifier amp;
    Tuner tuner;
    StreamingPlayer player;
    Projector projector;
    TheaterLights lights;
    Screen screen;
    PopcornPopper popper;

    public HomeTheaterFacade(
            Amplifier amp,
            Tuner tuner,
            StreamingPlayer player,
            Projector projector,
            TheaterLights lights,
            Screen screen,
            PopcornPopper popper) {
        this.amp = amp;
        this.tuner = tuner;
        this.player = player;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
    }

    public HomeTheaterFacade() {
        this.amp = new Amplifier();
        this.tuner = new Tuner();
        this.player = new StreamingPlayer();
        this.projector = new Projector();
        this.lights = new TheaterLights();
        this.screen = new Screen();
        this.popper = new PopcornPopper();
    }

    public void watchMovie(String movie) {
        System.out.println("영화 볼 준비 중");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setStreamingPlayer(player);
        amp.setSurroundSound();
        amp.setVolume(5);
        player.on();
        player.play(movie);
    }
}

package jiin.chapter12_compound.bpm;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.Line;
import lombok.Getter;

public class BeatModel implements BeatModelInterface, Runnable {
    List<BeatObserver> beatObserverList = new ArrayList<>();
    List<BpmObserver> bpmObserverList = new ArrayList<>();

    @Getter private int bpm;
    private Thread thread;
    private boolean stop = false;
    Clip clip;

    @Override
    public void initialize() {
        try {
            File resource = new File("clap.wav");
            clip = (Clip) AudioSystem.getLine(new Line.Info(Clip.class));
            clip.open(AudioSystem.getAudioInputStream(resource));
        } catch (Exception ex) {
            System.out.println("Error: Can't load clip");
            System.out.println(ex);
        }
    }

    @Override
    public void on() {
        bpm = 90;
        notifyBpmObservers();
        thread = new Thread(this);
        stop = false;
        thread.start();
    }

    @Override
    public void off() {
        stopBeat();
        stop = true;
    }

    @Override
    public void setBpm(int bpm) {
        this.bpm = bpm;
        notifyBpmObservers();
    }

    @Override
    public void registerObserver(BeatObserver beatObserver) {
        beatObserverList.add(beatObserver);
    }

    public void notifyBeatObservers() {
        for (BeatObserver beatObserver : beatObserverList) {
            beatObserver.updateBeat();
        }
    }

    @Override
    public void removeObserver(BeatObserver beatObserver) {
        beatObserverList.remove(beatObserver);
    }

    @Override
    public void registerObserver(BpmObserver bpmObserver) {
        bpmObserverList.add(bpmObserver);
    }

    public void notifyBpmObservers() {
        for (BpmObserver bpmObserver : bpmObserverList) {
            bpmObserver.updateBpm();
        }
    }

    @Override
    public void removeObserver(BpmObserver bpmObserver) {
        bpmObserverList.remove(bpmObserver);
    }

    @Override
    public void run() {
        while (!stop) {
            playBeat();
            notifyBeatObservers();
            try {
                Thread.sleep(60000 / getBpm());
            } catch (Exception e) {
                System.err.println(e);
            }
        }
    }

    public void playBeat() {
        clip.setFramePosition(0);
        clip.start();
    }

    public void stopBeat() {
        clip.setFramePosition(0);
        clip.stop();
    }
}

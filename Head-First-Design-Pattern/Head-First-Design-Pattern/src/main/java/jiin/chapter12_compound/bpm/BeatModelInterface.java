package jiin.chapter12_compound.bpm;

public interface BeatModelInterface {
    void initialize();

    void on();

    void off();

    void setBpm(int bpm);

    int getBpm();

    void registerObserver(BeatObserver beatObserver);

    void removeObserver(BeatObserver beatObserver);

    void registerObserver(BpmObserver bpmObserver);

    void removeObserver(BpmObserver bpmObserver);
}

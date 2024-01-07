package minji.chapter07_facadePattern.components;

public class Tuner {

    private Amplifier amplifier;
    private TunerStatus status;

    enum TunerStatus {
        ON,
        OFF,
        DIM
    }

    public Tuner() {
        this.status = TunerStatus.OFF;
    }

    public void on() {
        this.status = TunerStatus.ON;
        System.out.println(this);
    }

    public void off() {
        this.status = TunerStatus.OFF;
        System.out.println(this);
    }

    public void dim() {
        this.status = TunerStatus.DIM;
        System.out.println(this);
    }

    public String toString() {
        return "The Status is : " + this.status;
    }
}

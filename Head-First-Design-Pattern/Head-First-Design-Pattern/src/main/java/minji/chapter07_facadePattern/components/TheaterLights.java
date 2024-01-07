package minji.chapter07_facadePattern.components;

public class TheaterLights {

    private Level status;
    private Integer brightness;

    enum Level {
        ON,
        OFF
    }

    public TheaterLights() {
        this.status = Level.OFF;
        this.brightness = 0;
    }

    public void on() {
        this.status = Level.ON;
        System.out.println(this);
    }

    public void off() {
        this.status = Level.OFF;
        System.out.println(this);
    }

    public void dim(Integer brightness) {
        this.brightness = brightness;
        System.out.println(this);
    }

    public void setStatus(Level status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "TheaterLights{" + "status=" + status + ", brightness=" + brightness + '}';
    }
}

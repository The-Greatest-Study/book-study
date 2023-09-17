package minji.chapter07_facadePattern.components;

public class Projector {

    StreamingPlayer player;
    ProjectorStatus status;
    ProjectMode mode;

    enum ProjectorStatus {
        ON,
        OFF
    }

    enum ProjectMode {
        TV_MODE,
        WIDE_SCREEN_MODE
    }

    public Projector() {
        this.player = new StreamingPlayer();
        this.status = ProjectorStatus.OFF;
        this.mode = ProjectMode.TV_MODE;
    }

    public void on() {
        this.status = ProjectorStatus.ON;
        System.out.println(this);
    }

    public void off() {
        this.status = ProjectorStatus.OFF;
        System.out.println(this);
    }

    public void tvMode() {
        this.mode = ProjectMode.TV_MODE;
        System.out.println(this);
    }

    public void wideScreenMode() {
        this.mode = ProjectMode.WIDE_SCREEN_MODE;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Projector{" +
                "status=" + status +
                ", mode=" + mode +
                '}';
    }
}

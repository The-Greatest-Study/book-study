package minji.chapter07_facadePattern.components;

public class Amplifier {
    private Tuner tuner;
    private StreamingPlayer player;
    private AmplifierStatus status;
    private AmplifierSoundMode soundMode;
    private Integer volume;

    enum AmplifierStatus {
        ON,
        OFF
    }

    enum AmplifierSoundMode {
        STEREO,
        SURROUND
    }

    public Amplifier() {
        this.status = AmplifierStatus.OFF;
        this.soundMode = AmplifierSoundMode.STEREO;
        this.volume = 5;
    }

    public void on() {
        this.status = AmplifierStatus.ON;
        System.out.println(this);
    }

    public void off() {
        this.status = AmplifierStatus.OFF;
        System.out.println(this);
    }

    public void setStereoSound() {
        this.soundMode = AmplifierSoundMode.STEREO;
        System.out.println(this);
    }

    public void setSurroundSound() {
        this.soundMode = AmplifierSoundMode.SURROUND;
        System.out.println(this);
    }

    public void setStreamingPlayer(StreamingPlayer player) {
        this.player = player;
    }

    public void setStatus(AmplifierStatus status) {
        this.status = status;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Amplifier{"
                + "tuner="
                + tuner
                + ", player="
                + player
                + ", status="
                + status
                + ", soundMode="
                + soundMode
                + ", volume="
                + volume
                + '}';
    }
}

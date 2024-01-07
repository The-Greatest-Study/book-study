package minji.chapter07_facadePattern.components;

public class StreamingPlayer {
    Amplifier amplifier;
    StreamingPlayerStatus status;
    AudioMode mode;
    String movie;

    enum StreamingPlayerStatus {
        ON,
        OFF,
        PAUSE,
        PLAY,
        STOP
    }

    enum AudioMode {
        SURROUND_AUDIO,
        TWO_CHANNEL_AUDIO
    }

    public StreamingPlayer() {
        this.status = StreamingPlayerStatus.OFF;
        this.mode = AudioMode.SURROUND_AUDIO;
    }

    public void on() {
        this.status = StreamingPlayerStatus.ON;
        System.out.println(this);
    }

    public void off() {
        this.status = StreamingPlayerStatus.OFF;
        System.out.println(this);
    }

    public void pause() {
        this.status = StreamingPlayerStatus.PAUSE;
        System.out.println(this);
    }

    public void play(String movie) {
        this.status = StreamingPlayerStatus.PLAY;
        this.movie = movie;
        System.out.println(this);
    }

    public void stop() {
        this.status = StreamingPlayerStatus.STOP;
        System.out.println(this);
    }

    public void setSurroundAudio() {
        this.mode = AudioMode.SURROUND_AUDIO;
        System.out.println(this);
    }

    public void setTwoChannelAudio() {
        this.mode = AudioMode.TWO_CHANNEL_AUDIO;
        System.out.println(this);
    }

    public StreamingPlayer(StreamingPlayerStatus status, AudioMode mode, String movie) {
        this.status = status;
        this.mode = mode;
        this.movie = movie;
    }

    @Override
    public String toString() {
        return "StreamingPlayer{"
                + "status="
                + status
                + ", mode="
                + mode
                + ", movie='"
                + movie
                + '\''
                + '}';
    }
}

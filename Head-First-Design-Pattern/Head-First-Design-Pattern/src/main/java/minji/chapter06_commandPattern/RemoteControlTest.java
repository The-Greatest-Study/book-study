package minji.chapter06_commandPattern;

public class RemoteControlTest {
    // 클라이언트
    public static void main(String[] args) {
        // 인보커
        SimpleRemoteControl remote = new SimpleRemoteControl();
        // 리시버
        Light light = new Light();
        // 커맨드
        LightOnCommand lightOn = new LightOnCommand(light);

    }
}

package jihong.chapter06_Command.Command.Stereo;

public class Stereo {

    private int volumne;
    private String room;

    public void on(){
        System.out.println("오디오가 켜졌습니다");
    }

    public void off(){
        System.out.println("오디오가 꺼졌습니다");
    }

    public void setCD(){

    }
    public void setVolume(int volume){
        this.volumne = volume;
    }

    public Stereo(String room){
        this.room = room;
    }
}

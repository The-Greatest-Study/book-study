package jihong.chapter06_Command.Command.Light;

public class Light {

    private String room;

    public void on(){
        System.out.println(room + " 조명이 켜졌습니다");
    }

    public void off(){
        System.out.println(room + " 조명이 꺼졌습니다");
    }

    public Light(String room){
        this.room = room;
    }

    public Light(){

    }
}

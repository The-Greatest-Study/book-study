package jihong.chapter06_Command.Command.CeilingFan;

import lombok.Data;

@Data
public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    private String location;
    private int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
        System.out.println(this.location + " 선풍기 속도가 HIGH로 설정되었습니다" );
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println(this.location + " 선풍기 속도가 MEDIUM으로 설정되었습니다" );
    }

    public void low() {
        speed = LOW;
        System.out.println(this.location + " 선풍기 속도가 LOW로 설정되었습니다" );
    }

    public void off() {
        speed = OFF;
        System.out.println(this.location + " 선풍기가 종료되었습니다" );
    }

}

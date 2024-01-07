package minho.chapter06_encapsulation_of_method_call.Equipments;

public class Light {
    String location = "";

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(this.location + " Light On!");
    }

    public void off() {
        System.out.println(this.location + " Light Off!");
    }
}

package minji.chapter07_facadePattern.components;

public class PopcornPopper {

    private PopcornPopperStatus status;

    enum PopcornPopperStatus {
        ON,
        OFF,
        POP
    }

    public PopcornPopper() {
        status = PopcornPopperStatus.OFF;
    }

    public void on() {
        status = PopcornPopperStatus.ON;
        System.out.println(this);
    }

    public void off() {
        status = PopcornPopperStatus.OFF;
        System.out.println(this);
    }

    public void pop() {
        status = PopcornPopperStatus.POP;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "PopcornPopper{" + "status=" + status + '}';
    }
}

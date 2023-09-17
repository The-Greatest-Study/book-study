package minji.chapter07_facadePattern.components;

public class Screen {

    private ScreenStatus screenStatus;

    enum ScreenStatus {
        UP,
        DOWN
    }

    public Screen() {
        this.screenStatus = ScreenStatus.UP;
    }

    public void up() {
        if (this.screenStatus == ScreenStatus.UP) {
            System.out.println("Screen is already up");
        } else {
            this.screenStatus = ScreenStatus.UP;
        }
        System.out.println(this);
    }

    public void down() {
        if (this.screenStatus == ScreenStatus.DOWN) {
            System.out.println("Screen is already down");
        } else {
            this.screenStatus = ScreenStatus.DOWN;
        }
        System.out.println(this);

    }

    @Override
    public String toString() {
        return "Screen{" +
                "status=" + screenStatus +
                '}';
    }
}

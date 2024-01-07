package jihong.chapter06_Command.Command;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("지정된 Command 없음");
    }

    @Override
    public void undo() {
        System.out.println("지정된 Command 없음");
    }
}

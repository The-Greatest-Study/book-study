package minji.chapter06_commandPattern.Commands;

public class NoCommand implements Command{
    @Override
    public void execute() {
        System.out.println("No command assigned yet");
    }

    @Override
    public void undo() {
        System.out.println("No command assigned yet");
    }
}

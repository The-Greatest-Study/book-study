package minji.chapter06_commandPattern.Commands;

public interface Command {
    public void execute();

    public void undo();
}

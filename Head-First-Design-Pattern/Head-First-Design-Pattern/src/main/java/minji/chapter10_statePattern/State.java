package minji.chapter10_statePattern;

public interface State {
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
    default void refill(int count){};
}

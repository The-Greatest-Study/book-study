package jiin.chapter10_state;

public interface GumballMachineState {
    void refill(int count);

    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}

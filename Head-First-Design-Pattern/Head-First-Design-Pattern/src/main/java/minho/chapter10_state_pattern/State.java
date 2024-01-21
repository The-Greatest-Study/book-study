package minho.chapter10_state_pattern;

import java.io.Serializable;

public interface State extends Serializable {

    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();

    void refill();
}

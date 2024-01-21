package minji.chapter10_statePattern;

import java.rmi.RemoteException;

public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachine gumballMachine = null;
        try {
            gumballMachine = new GumballMachine(5, "Seoul");
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.ejectQuarter();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.refillBalls(10);

        System.out.println("=========TEST DRIVE 2=========");

        GumballMachine gumballMachine2 = null;
        try {
            gumballMachine2 = new GumballMachine(5, "Seoul");
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }

        System.out.println(gumballMachine2);

        gumballMachine2.insertQuarter();
        gumballMachine2.turnCrank();

        System.out.println(gumballMachine2);

        gumballMachine2.insertQuarter();
        gumballMachine2.turnCrank();
        gumballMachine2.insertQuarter();
        gumballMachine2.turnCrank();

        System.out.println(gumballMachine2);
    }
}

package jihong.chapter11_Proxy;

import java.rmi.Naming;
import jihong.chapter10_Status.GumballMachine;

public class GumballMachineTestDrive {
    public static void main(String[] args) {
        int count = 0;
        GumballMachine gumballMachine = null;

        try {
            count = Integer.parseInt("100");

            gumballMachine = new GumballMachine("santafe.mightygumball.com", count);
            Naming.rebind("//" + "santafe.mightygumball.com" + "/gumballmachine", gumballMachine);

        } catch (Exception e) {
            e.printStackTrace();
            ;
        }

        GumballMonitor monitor = new GumballMonitor(gumballMachine);

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        gumballMachine.refill(count);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        monitor.report();
    }
}

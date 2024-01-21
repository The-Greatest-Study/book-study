package minho.chapter11_proxy_pattern.remote_proxy;

import java.rmi.Naming;
import minho.chapter10_state_pattern.GumballMachine;

public class GumballMachineTestDrive {

    public static void main(String[] args) {
        int count = 0;
        GumballMachine gumballMachine = null;

        if (args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }

        try {
            count = Integer.parseInt(args[1]);

            gumballMachine = GumballMachine.create(args[0], count);
            Naming.rebind("//" + args[0] + "/gumballmachine", gumballMachine);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package jiin.chapter11_proxy.gumballmonitor;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Arrays;
import jiin.chapter11_proxy.gumball.GumballMachineRemote;

public class GumballMonitorTestDrive {
    public static void main(String[] args) {
        String[] locations = {
            "rmi://santafe.mightygumball.com/gumballmachine",
            "rmi://boulder.mightygumball.com/gumballmachine",
            "rmi://austin.mightygumball.com/gumballmachine"
        };

        GumballMonitor[] monitors = new GumballMonitor[locations.length];

        for (int index = 0; index < locations.length; index++) {
            try {
                GumballMachineRemote machine =
                        (GumballMachineRemote) Naming.lookup(locations[index]);
                monitors[index] = new GumballMonitor(machine);
                System.out.println(monitors[index]);
            } catch (MalformedURLException | NotBoundException | RemoteException e) {
                e.printStackTrace();
            }
        }

        Arrays.stream(monitors).forEach(GumballMonitor::report);
    }
}

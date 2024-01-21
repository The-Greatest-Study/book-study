package minho.chapter11_proxy_pattern.remote_proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class GumballMonitorTestDrive {

    public static void main(String[] args) {
        String[] location = {
            "rmi://santafe.mightygumball.com/gumballmachine",
            "rmi://bouler.mightygumball.com/gumballmachine",
            "rmi://austin.mightygumball.com/gumballmachine"
        };

        GumballMonitor[] monitors = new GumballMonitor[location.length];

        for (int i = 0; i < location.length; i++) {
            try {
                GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(location[i]);
                monitors[i] = GumballMonitor.from(machine);
                System.out.println(monitors[i]);
            } catch (RemoteException | NotBoundException | MalformedURLException re) {
                re.printStackTrace();
            }
        }

        for (GumballMonitor monitor : monitors) {
            monitor.report();
        }
    }
}

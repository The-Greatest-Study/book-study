package minho.chapter11_proxy_pattern.remote_proxy;

import java.rmi.*;

public class GumballMonitor {

    GumballMachineRemote machine;

    private GumballMonitor(GumballMachineRemote machine) {
        this.machine = machine;
    }

    public static GumballMonitor from(GumballMachineRemote machine) {
        return new GumballMonitor(machine);
    }

    public void report() {
        try {
            System.out.println("뽑기 기계 위치: " + machine.getLocation());
            System.out.println("현재 재고: " + machine.getCount() + "개");
            System.out.println("현재 상태: " + machine.getState());
        } catch (RemoteException re) {
            re.printStackTrace();
        }
    }
}

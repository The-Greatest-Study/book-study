package minji.chapter11_proxyPattern;

import minji.chapter10_statePattern.GumballMachineRemote;

public class GumballMonitor {
    GumballMachineRemote machine;

    public GumballMonitor(GumballMachineRemote machine) {
        this.machine = machine;
    }

    public void report() {
        try {
            System.out.println("뽑기 기계 위치: " + machine.getLocation());
            System.out.println("현재 재고: " + machine.getCount());
            System.out.println("뽑기 상태: " + machine.getState());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

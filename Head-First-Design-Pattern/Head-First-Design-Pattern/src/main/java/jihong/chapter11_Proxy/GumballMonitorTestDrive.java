package jihong.chapter11_Proxy;

import java.lang.reflect.Array;
import java.rmi.Naming;
import java.util.Arrays;

public class GumballMonitorTestDrive {

    public static void main(String[] args) {
        String[] location = {
                "rmi://santafe.mightygumball.com/gumballmachine"
        };
        
        GumballMonitor[] monitor = new GumballMonitor[location.length];

        for(int i=0; i<location.length; i++){
            try{
                GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(location[i]);
                monitor[i] = new GumballMonitor(machine);
                System.out.println(monitor[i]);
            }catch (Exception e){
                e.printStackTrace();;
            }
        }

        Arrays.stream(monitor).forEach(e -> e.report());
    }
}

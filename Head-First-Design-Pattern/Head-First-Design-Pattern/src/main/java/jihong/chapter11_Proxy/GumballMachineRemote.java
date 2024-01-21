package jihong.chapter11_Proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;
import jihong.chapter10_Status.State;

public interface GumballMachineRemote extends Remote {
    public int getCount() throws RemoteException;

    public String getLocation() throws RemoteException;

    public State getState() throws RemoteException;
}

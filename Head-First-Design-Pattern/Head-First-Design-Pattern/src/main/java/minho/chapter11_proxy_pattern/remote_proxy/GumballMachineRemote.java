package minho.chapter11_proxy_pattern.remote_proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;
import minho.chapter10_state_pattern.State;

public interface GumballMachineRemote extends Remote {

    int getCount() throws RemoteException;

    String getLocation() throws RemoteException;

    State getState() throws RemoteException;
}

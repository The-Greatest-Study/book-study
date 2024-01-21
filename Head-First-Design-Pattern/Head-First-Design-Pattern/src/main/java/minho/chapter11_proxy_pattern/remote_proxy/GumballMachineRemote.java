package minho.chapter11_proxy_pattern.remote_proxy;

import minho.chapter10_state_pattern.State;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GumballMachineRemote extends Remote {

    int getCount() throws RemoteException;
    String getLocation() throws RemoteException;
    State getState() throws RemoteException;

}

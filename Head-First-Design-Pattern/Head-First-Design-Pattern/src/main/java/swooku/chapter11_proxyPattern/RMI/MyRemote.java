package swooku.chapter11_proxyPattern.RMI;

import java.rmi.*;

public interface MyRemote extends Remote {
    public String sayHello() throws RemoteException;
}

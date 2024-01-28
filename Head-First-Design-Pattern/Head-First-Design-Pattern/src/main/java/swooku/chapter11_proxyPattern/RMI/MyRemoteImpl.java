package swooku.chapter11_proxyPattern.RMI;

import java.rmi.*;
import java.rmi.server.*;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    private static final long serialVersionUID = 1L;

    protected MyRemoteImpl() throws RemoteException {
        super();
    }

    public String sayHello() {
        return "Server says, 'Hey'";
    }

    public static void main(String[] args) {
        try {
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("RemoteHello", service); // registry에 등록
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

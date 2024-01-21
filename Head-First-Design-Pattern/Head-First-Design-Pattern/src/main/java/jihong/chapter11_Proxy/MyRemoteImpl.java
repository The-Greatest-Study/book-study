package jihong.chapter11_Proxy;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    
    private static long serialVersionUID = 1L;

    protected MyRemoteImpl() throws RemoteException {
    }
    
    public static void main (String[] args){
        try{
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("RemoteHello", service);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public String sayHello(){
        return "Server says, 'Hey'";
    }
    
}

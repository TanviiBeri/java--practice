package rmi;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class HelloImpl extends UnicastRemoteObject implements Hello{
    public HelloImpl() throws RemoteException{
        super();
    }
    public String sayHello(){
        return "Hello from Server!";
    }
}



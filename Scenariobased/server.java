package Scenariobased;

import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;

public class server extends UnicastRemoteObject implements addition {

    server() throws RemoteException {}

    public int add(int a, int b) throws RemoteException {
        return a + b;
    }

    public static void main(String[] args) {
        try {
            server s = new server();
            Naming.rebind("rmi://localhost/add", s);
            System.out.println("up");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
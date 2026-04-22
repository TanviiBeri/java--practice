package Scenariobased;

import java.rmi.*;

public interface addition extends Remote {
    int add(int a, int b) throws RemoteException;
}

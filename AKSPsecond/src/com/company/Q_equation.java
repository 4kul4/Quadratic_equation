package com.company;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Q_equation extends Remote{
    void CalcQ_equation(int a, int b, int c) throws RemoteException;
}

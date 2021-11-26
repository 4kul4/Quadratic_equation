package com.company;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server extends Q_equationImpl {
    public static void main(String[] args){
        try{
            Q_equationImpl obj = new Q_equationImpl();

            Q_equation stub = (Q_equation) UnicastRemoteObject.exportObject(obj, 0);

            Registry registry = LocateRegistry.createRegistry(8080);

            registry.bind("Equation", stub);
            System.err.println("Server Ready");
            Thread.sleep(Integer.MAX_VALUE);
        } catch (Exception e){
            System.err.println("Exception " + e.toString());
            e.printStackTrace();
        }
    }
}
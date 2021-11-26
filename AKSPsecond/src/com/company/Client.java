package com.company;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {

    public static void main(String[] args){
        try {
            Registry registry = LocateRegistry.getRegistry(8080);
            Q_equation stub = (Q_equation) registry.lookup("Equation");
            stub.CalcQ_equation(3,5,1);
        }   catch (Exception e){
            System.err.println("Exception: "+ e.toString());
            e.printStackTrace();
        }
    }
}
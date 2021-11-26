package com.company;

import java.rmi.RemoteException;

import static java.lang.Math.sqrt;

public class Q_equationImpl implements Q_equation{

    @Override
    public void CalcQ_equation(int a, int b, int c) throws RemoteException {
        int D = b*b - 4 * a * c;
        if(D > 0){
            double x1 = (-b + sqrt(D))/(2*a);
            double x2 = (-b - sqrt(D))/(2*a);
            System.out.println("x1: " + x1 + "\n"
                    + "x2: " + x2);
        } else if(D == 0){
            double x1 = -b/(2*a);
            System.out.println("x: " + x1);
        } else {
            System.out.println("No root in the quadratic equation");
        }

    }
}
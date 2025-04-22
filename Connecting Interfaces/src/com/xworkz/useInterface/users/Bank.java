package com.xworkz.useInterface.users;

import com.xworkz.useInterface.interfaces.RBIRegulations;

public class Bank {
    private RBIRegulations obj;

    public Bank(RBIRegulations obj) {

        this.obj = obj;
    }

    public void use() {
        if (obj!=null) {
            obj.maintainCashReserve();
        } else {
            System.err.println("RBIRegulations is null");
        }

    }
}
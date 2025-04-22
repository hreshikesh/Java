package com.xworkz.useInterface.impl;

import com.xworkz.useInterface.interfaces.Logistics;

public class FedExImpl implements Logistics {
    public void deliverPackage() {
        System.out.println("FedExImpl is executing deliverPackage.");
    }
}
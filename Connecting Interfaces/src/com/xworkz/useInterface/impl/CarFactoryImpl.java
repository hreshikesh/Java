package com.xworkz.useInterface.impl;

import com.xworkz.useInterface.interfaces.Machine;

public class CarFactoryImpl implements Machine {
    public void manufacture() {
        System.out.println("CarFactoryImpl is executing manufacture.");
    }
}
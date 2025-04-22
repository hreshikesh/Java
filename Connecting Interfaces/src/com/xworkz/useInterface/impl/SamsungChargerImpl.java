package com.xworkz.useInterface.impl;

import com.xworkz.useInterface.interfaces.Charger;

public class SamsungChargerImpl implements Charger {
    public void supplyPower() {
        System.out.println("SamsungChargerImpl is executing supplyPower.");
    }
}
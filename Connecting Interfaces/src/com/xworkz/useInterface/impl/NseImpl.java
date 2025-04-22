package com.xworkz.useInterface.impl;

import com.xworkz.useInterface.interfaces.MarketRegulator;

public class NseImpl implements MarketRegulator {
    public void monitorTrade() {
        System.out.println("NseImpl is executing monitorTrade.");
    }
}
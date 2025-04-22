package com.xworkz.useInterface.impl;

import com.xworkz.useInterface.interfaces.BillingSystem;

public class SmartSupermarketImpl implements BillingSystem {
    public void generateBill() {
        System.out.println("SmartSupermarketImpl is executing generateBill.");
    }
}
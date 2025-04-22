package com.xworkz.useInterface.impl;

import com.xworkz.useInterface.interfaces.InventorySystem;

public class AmazonImpl implements InventorySystem {
    public void updateStock() {
        System.out.println("AmazonImpl is executing updateStock.");
    }
}
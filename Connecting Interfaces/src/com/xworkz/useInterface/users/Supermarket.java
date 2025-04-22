package com.xworkz.useInterface.users;

import com.xworkz.useInterface.interfaces.BillingSystem;

public class Supermarket {
    private BillingSystem obj;

    public Supermarket(BillingSystem obj) {

        this.obj = obj;
    }

    public void use() {

        if (obj != null) {
            obj.generateBill();
        } else {
            System.err.println("BillingSystem is null");
        }
    }
}
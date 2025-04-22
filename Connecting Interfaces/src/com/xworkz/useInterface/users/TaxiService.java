package com.xworkz.useInterface.users;

import com.xworkz.useInterface.interfaces.FareSystem;

public class TaxiService {
    private FareSystem obj;

    public TaxiService(FareSystem obj) {

        this.obj = obj;
    }

    public void use() {
        if (obj != null) {
            obj.calculateFare();
        } else {
            System.err.println("LawSystem is null");
        }
    }
}
package com.xworkz.useInterface.users;

import com.xworkz.useInterface.interfaces.Logistics;

public class DeliveryService {
    private Logistics obj;

    public DeliveryService(Logistics obj) {

        this.obj = obj;
    }

    public void use() {

        if (obj != null) {
            obj.deliverPackage();
        } else {
            System.err.println("LawSystem is null");
        }
    }
}
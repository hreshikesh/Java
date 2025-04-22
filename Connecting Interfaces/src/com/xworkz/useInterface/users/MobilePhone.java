package com.xworkz.useInterface.users;

import com.xworkz.useInterface.interfaces.Charger;

public class MobilePhone {
    private Charger obj;

    public MobilePhone(Charger obj) {

        this.obj = obj;
    }

    public void use() {
        if (obj != null) {
            obj.supplyPower();
        } else {
            System.err.println("LawSystem is null");
        }
    }
}
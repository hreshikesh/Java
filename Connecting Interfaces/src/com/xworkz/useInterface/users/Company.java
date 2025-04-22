package com.xworkz.useInterface.users;

import com.xworkz.useInterface.interfaces.HRPolicy;

public class Company {
    private HRPolicy obj;

    public Company(HRPolicy obj) {
        this.obj = obj;
    }


    public void use() {

        if (obj != null) {
            obj.followRules();
        } else {
            System.err.println("HRPolicy is null");
        }
    }
}
package com.xworkz.useInterface.users;

import  com.xworkz.useInterface.interfaces.HealthcareSystem;

public class Hospital {
    private HealthcareSystem obj;

    public Hospital(HealthcareSystem obj) {

        this.obj = obj;
    }

    public void use() {
        if (obj != null) {
            obj.treatPatient();
        } else {
            System.err.println("LawSystem is null");
        }
    }
}
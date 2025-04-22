package com.xworkz.useInterface.users;

import com.xworkz.useInterface.interfaces.Laptop;

public class OperatingSystem {
    private Laptop obj;

    public OperatingSystem(Laptop obj) {

        this.obj = obj;
    }

    public void use() {

        if (obj != null) {
            obj.process();
        } else {
            System.err.println("LawSystem is null");
        }
    }
}
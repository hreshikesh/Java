package com.xworkz.useInterface.users;

import com.xworkz.useInterface.interfaces.AgriculturePolicy;

public class Farm {
    private AgriculturePolicy obj;

    public Farm(AgriculturePolicy obj) {

        this.obj = obj;
    }

    public void use() {

        if (obj != null) {
            obj.growCrops();
        } else {
            System.err.println("LawSystem is null");
        }
    }
}
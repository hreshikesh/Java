package com.xworkz.useInterface.users;

import com.xworkz.useInterface.interfaces.FitnessPlan;

public class Gym {
    private FitnessPlan obj;

    public Gym(FitnessPlan obj) {

        this.obj = obj;
    }

    public void use() {
        if (obj != null) {
            obj.trainClient();
        } else {
            System.err.println("FitnessPlan is null");
        }
    }
}
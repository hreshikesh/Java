package com.xworkz.useInterface.users;

import com.xworkz.useInterface.interfaces.RoadRules;

public class TrafficPolice {
    private RoadRules obj;

    public TrafficPolice(RoadRules obj) {

        this.obj = obj;
    }

    public void use()
    {
        if (obj != null) {
            obj.enforceLaw();
        } else {
            System.err.println("RoadRules is null");
        }

    }
}
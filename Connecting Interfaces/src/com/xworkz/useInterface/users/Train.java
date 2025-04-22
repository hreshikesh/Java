package com.xworkz.useInterface.users;

import com.xworkz.useInterface.interfaces.RailwaySignalSystem;

public class Train {
    private RailwaySignalSystem obj;

    public Train(RailwaySignalSystem obj) {

        this.obj = obj;
    }

    public void use() {

        if (obj != null) {
            obj.followSignal();
        } else {
            System.err.println("RailwaySignalSystem is null");
        }
        obj.followSignal();
    }
}
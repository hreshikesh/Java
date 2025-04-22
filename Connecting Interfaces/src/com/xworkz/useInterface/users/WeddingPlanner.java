package com.xworkz.useInterface.users;

import com.xworkz.useInterface.interfaces.EventPlan;

public class WeddingPlanner {
    private EventPlan obj;

    public WeddingPlanner(EventPlan obj) {

        this.obj = obj;
    }

    public void use() {

        if (obj != null) {
            obj.organizeEvent();
        } else {
            System.err.println("EventPlan is null");
        }
    }
}
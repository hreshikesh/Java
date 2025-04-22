package com.xworkz.useInterface.users;

import com.xworkz.useInterface.interfaces.SpaceAgency;

public class NASA {
    private SpaceAgency obj;

    public NASA(SpaceAgency obj) {

        this.obj = obj;
    }

    public void use() {

        if (obj != null) {
            obj.launchRocket();
        } else {
            System.err.println("LawSystem is null");
        }
    }
}
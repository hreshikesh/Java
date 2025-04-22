package com.xworkz.useInterface.users;

import com.xworkz.useInterface.interfaces.LaunchProtocol;

public class SpaceX {
    private LaunchProtocol obj;

    public SpaceX(LaunchProtocol obj) {

        this.obj = obj;
    }

    public void use() {
        if (obj != null) {
            obj.initiateLaunch();
        } else {
            System.err.println("LawSystem is null");
        }
    }
}
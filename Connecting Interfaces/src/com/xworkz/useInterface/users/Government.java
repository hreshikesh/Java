package com.xworkz.useInterface.users;

import com.xworkz.useInterface.interfaces.Constitution;

public class Government {
    private Constitution obj;

    public Government(Constitution obj) {

        this.obj = obj;
    }

    public void use()
    {
        if (obj != null) {
            obj.followLaws();
        } else {
            System.err.println("LawSystem is null");
        }
    }
}
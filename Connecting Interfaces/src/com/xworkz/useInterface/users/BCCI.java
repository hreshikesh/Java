package com.xworkz.useInterface.users;

import com.xworkz.useInterface.interfaces.Icc;

public class BCCI {
    private Icc obj;

    public BCCI(Icc obj) {

        this.obj = obj;
    }

    public void use()
    {
        if (obj != null) {
            obj.fairPlay();
        } else {
            System.err.println("Icc is null");
        }

    }
}
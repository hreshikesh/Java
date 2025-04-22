package com.xworkz.useInterface.users;

import com.xworkz.useInterface.interfaces.AccreditationBody;

public class University {
    private AccreditationBody obj;

    public University(AccreditationBody obj) {

        this.obj = obj;
    }

    public void use() {

        if (obj != null) {
            obj.maintainStandards();
        } else {
            System.err.println("AccreditationBody is null");
        }
    }
}
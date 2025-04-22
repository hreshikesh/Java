package com.xworkz.useInterface.users;

import com.xworkz.useInterface.interfaces.Machine;

public class Factory {
    private Machine obj;

    public Factory(Machine obj) {

        this.obj = obj;
    }

    public void use() {
        if (obj != null) {
            obj.manufacture();
        } else {
            System.err.println("LawSystem is null");
        }
    }
}
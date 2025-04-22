package com.xworkz.useInterface.users;

import com.xworkz.useInterface.interfaces.LawSystem;

public class Court {
    private LawSystem obj;

    public Court(LawSystem obj) {
        if (obj == null) {
            throw new IllegalArgumentException("LawSystem implementation cannot be null");
        }
        this.obj = obj;
    }

    public void use() {
        if (obj != null) {
            obj.giveVerdict();
        } else {
            System.err.println("LawSystem is null");
        }

    }
}
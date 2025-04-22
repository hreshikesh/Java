package com.xworkz.useInterface.users;

import com.xworkz.useInterface.interfaces.CharityRegulation;

public class NGO {
    private CharityRegulation obj;

    public NGO(CharityRegulation obj) {

        this.obj = obj;
    }

    public void use() {
        if (obj != null) {
            obj.helpPeople();
        } else {
            System.err.println("LawSystem is null");
        }
    }
}
package com.xworkz.useInterface.users;

import com.xworkz.useInterface.interfaces.DramaAssociation;

public class Theatre {
    private DramaAssociation obj;

    public Theatre(DramaAssociation obj) {

        this.obj = obj;
    }

    public void use() {

        if (obj != null) {
            obj.performPlay();
        } else {
            System.err.println("DramaAssociation is null");
        }
    }
}
package com.xworkz.useInterface.users;

import com.xworkz.useInterface.interfaces.CodingStandard;

public class SoftwareCompany {
    private CodingStandard obj;

    public SoftwareCompany(CodingStandard obj) {

        this.obj = obj;
    }

    public void use() {
        if (obj != null) {
            obj.writeCode();
        } else {
            System.err.println("LawSystem is null");
        }
    }
}
package com.xworkz.useInterface.users;

import com.xworkz.useInterface.interfaces.AnimalCare;

public class Zoo {
    private AnimalCare obj;

    public Zoo(AnimalCare obj) {

        this.obj = obj;
    }

    public void use() { if (obj != null) {
        obj.feedAnimals();
    } else {
        System.err.println("LawSystem is null");
    }
    }
}
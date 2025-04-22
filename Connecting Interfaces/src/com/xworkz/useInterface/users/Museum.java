package com.xworkz.useInterface.users;

import  com.xworkz.useInterface.interfaces.CulturalHeritage;

public class Museum {
    private CulturalHeritage obj;

    public Museum(CulturalHeritage obj) {

        this.obj = obj;
    }

    public void use() {
        if (obj != null) {
            obj.preserveArtifacts();
        } else {
            System.err.println("LawSystem is null");
        }
    }
}
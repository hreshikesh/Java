package com.xworkz.useInterface.users;

import com.xworkz.useInterface.interfaces.BuildingCode;

public class ConstructionCompany {
    private BuildingCode obj;

    public ConstructionCompany(BuildingCode obj) {

        this.obj = obj;
    }

    public void use() {
        if (obj != null) {
            obj.constructBuilding();
        } else {
            System.err.println("BuildingCode is null");
        }
    }
}
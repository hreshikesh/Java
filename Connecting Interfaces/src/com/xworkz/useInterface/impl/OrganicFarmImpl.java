package com.xworkz.useInterface.impl;;

import com.xworkz.useInterface.interfaces.AgriculturePolicy;

public class OrganicFarmImpl implements AgriculturePolicy {
    public void growCrops() {
        System.out.println("OrganicFarmImpl is executing growCrops.");
    }
}
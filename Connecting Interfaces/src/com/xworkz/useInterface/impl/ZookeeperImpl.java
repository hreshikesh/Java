package com.xworkz.useInterface.impl;

import com.xworkz.useInterface.interfaces.AnimalCare;

public class ZookeeperImpl implements AnimalCare {
    public void feedAnimals() {
        System.out.println("ZookeeperImpl is executing feedAnimals.");
    }
}
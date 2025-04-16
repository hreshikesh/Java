package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.Table;

public class DiningTable implements Table {

    @Override
    public void placeItems() {
        System.out.println("Placing items on the dining table.");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the dining table.");

    }

    @Override
    public void fold() {
        System.out.println("Folding the dining table.");

    }
}

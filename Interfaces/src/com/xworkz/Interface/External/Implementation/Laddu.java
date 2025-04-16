package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.Sweet;

public class Laddu implements Sweet {
    @Override
    public void makeSweet() {
        System.out.println("Making Laddu");
    }

    @Override
    public void packSweet() {
        System.out.println("Packing Laddu");
    }

    @Override
    public void sellSweet() {
        System.out.println("Selling Laddu");
    }
}

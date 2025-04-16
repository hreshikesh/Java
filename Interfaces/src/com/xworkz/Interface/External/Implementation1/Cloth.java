package com.xworkz.Interface.External.Implementation1;

import com.xworkz.Interface.Internal.Rules.Pant;
import com.xworkz.Interface.Internal.Rules.Shirt;

public class Cloth implements Shirt, Pant {

    @Override
    public void wearPant() {
        System.out.println("Cloth wearPant is important");
    }

    @Override
    public void washPant() {
        System.out.println("Cloth washPant is important");

    }

    @Override
    public void foldPant() {
        System.out.println("Cloth foldPant is important");

    }

    @Override
    public void wearShirt() {
        System.out.println("Cloth wearShirt is important");

    }

    @Override
    public void designShirt() {
        System.out.println("Cloth designShirt is important");

    }

    @Override
    public void printShirt() {
        System.out.println("Cloth printShirt is important");

    }
}

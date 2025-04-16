package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.Shirt;

public class CollarShirt implements Shirt {
    @Override
    public void wearShirt() {
        System.out.println("Wearing Collar Shirt");
    }

    @Override
    public void designShirt() {
        System.out.println("Designing Collar Shirt");
    }

    @Override
    public void printShirt() {
        System.out.println("Printing Collar Shirt");
    }
}

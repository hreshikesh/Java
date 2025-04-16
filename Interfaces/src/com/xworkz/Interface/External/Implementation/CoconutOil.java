package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.Oil;

public class CoconutOil implements Oil {
    @Override
    public void extractOil() {
        System.out.println("Extracting coconut oil");
    }

    @Override
    public void sellOil() {
        System.out.println("Selling coconut oil");
    }

    @Override
    public void useOil() {
        System.out.println("Using coconut oil");
    }
}

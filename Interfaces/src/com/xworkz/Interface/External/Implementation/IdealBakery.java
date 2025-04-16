package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.Bakery;

public class IdealBakery implements Bakery {
    @Override
    public void bakeCake() {
        System.out.println("Baking a cake at Ideal Bakery");
    }

    @Override
    public void bakeBread() {
        System.out.println("Baking bread at Ideal Bakery");
    }

    @Override
    public void makePastry() {
        System.out.println("Making pastry at Ideal Bakery");
    }
}

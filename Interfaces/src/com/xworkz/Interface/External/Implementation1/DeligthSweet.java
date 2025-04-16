package com.xworkz.Interface.External.Implementation1;

import com.xworkz.Interface.Internal.Rules.Bakery;
import com.xworkz.Interface.Internal.Rules.SaloonRule;
import com.xworkz.Interface.Internal.Rules.Sweet;

public class DeligthSweet implements Sweet, Bakery {

    @Override
    public void bakeCake() {
        System.out.println("DeligthSweet bakeCake is important");
    }

    @Override
    public void bakeBread() {
        System.out.println("DeligthSweet bakeBread is important");

    }

    @Override
    public void makePastry() {
        System.out.println("DeligthSweet makePastry is important");

    }

    @Override
    public void makeSweet() {
        System.out.println("DeligthSweet makeSweet is important");

    }

    @Override
    public void packSweet() {
        System.out.println("DeligthSweet packSweet is important");

    }

    @Override
    public void sellSweet() {
        System.out.println("DeligthSweet sellSweet is important");

    }
}

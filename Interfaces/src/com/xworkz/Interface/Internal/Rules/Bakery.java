package com.xworkz.Interface.Internal.Rules;

public interface Bakery {
    void bakeCake();

    void bakeBread();

    void makePastry();

    default void bakeryInfo() {
        System.out.println("Bakery information");
    }


}

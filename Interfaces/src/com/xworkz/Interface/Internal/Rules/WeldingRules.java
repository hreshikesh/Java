package com.xworkz.Interface.Internal.Rules;

public interface WeldingRules {
    void weld();
    void cut();
    void grind();

    default void weldingInfo() {
        System.out.println("Welding information");
    }


}

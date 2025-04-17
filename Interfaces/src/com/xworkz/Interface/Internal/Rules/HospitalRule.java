package com.xworkz.Interface.Internal.Rules;

public interface HospitalRule {
    void treat();
    void provideCare();
    void hygiene();

    default void hospitalInfo() {
        System.out.println("Hospital information");
    }

}

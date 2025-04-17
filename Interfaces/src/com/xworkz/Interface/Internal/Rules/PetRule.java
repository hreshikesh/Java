package com.xworkz.Interface.Internal.Rules;

public interface PetRule {
    void feed();
    void walk();
    void groom();

    default void petInfo() {
        System.out.println("Pet information");
    }
}

package com.xworkz.Interface.Internal.Rules;

public interface BarberRule {
    void barberSafety();

    void barberTools();

    void barberHygiene();

    default void barberInfo() {
        System.out.println("Barber information");
    }

}

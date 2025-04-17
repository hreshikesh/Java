package com.xworkz.Interface.Internal.Rules;

public interface SaloonRule {


    void saloonServices();

    void saloonCustomerCare();

    void saloonHygiene();

    default void saloonInfo() {
        System.out.println("Saloon information");
    }
}

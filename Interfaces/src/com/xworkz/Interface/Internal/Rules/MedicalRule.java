package com.xworkz.Interface.Internal.Rules;

public interface MedicalRule {
    void medicalHygiene();

    void medicalServices();

    void medicalCustomerCare();

    default void medicalInfo() {
        System.out.println("Medical information");
    }
}

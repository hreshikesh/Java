package com.xworkz.Interface.Internal.Rules;

public interface BankRule {
    void open();
    void close();
    void deposit();
    default void bankInfo() {
        System.out.println("Bank information");
    }
}

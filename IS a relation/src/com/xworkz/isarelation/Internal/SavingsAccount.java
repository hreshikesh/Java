package com.xworkz.isarelation.Internal;

public class SavingsAccount extends Bank {
    public SavingsAccount() {
        System.out.println("Running no-arg constructor of SavingsAccount");
    }
    @Override
    public void deposit() {
        System.out.println("Running deposit in subclass");
    }
    @Override
    public void withdraw() {
        System.out.println("Running withdrawin subclass");
    }
    @Override
    public void checkBalance() {
        System.out.println("Running checkBalance in subclass");
    }
    @Override
    public void transferMoney() {
        System.out.println("Running transferMoney in subclass");
    }
    @Override
    public void provideLoan() {
        System.out.println("Running provideLoan in subclass");
    }
}

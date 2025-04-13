package com.xworkz.ToString.Internal;

public class Bank {
    private String name;
    private String branch;
    private int balance;

    public Bank(String name, String branch, int balance) {
        this.name = name;
        this.branch = branch;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Bank name " + this.name + " branch " + this.branch + " Balance " + this.balance;
    }
    @Override
    public int hashCode() {
        return 120;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("obj is not null");
            if (obj instanceof Bank) {
                Bank b1 = this;
                Bank b2 = (Bank) obj;
                if (b1.balance == b2.balance) {
                    System.out.println("Same balance");
                    return true;
                }
            }
        }
        return false;
    }

}

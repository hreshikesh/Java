package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.BankRule;

public class HDFC implements BankRule {
    @Override
    public void open() {
        System.out.println("Opening HDFC bank");
    }

    @Override
    public void close() {
        System.out.println("Closing HDFC bank");
    }

    @Override
    public void deposit() {
        System.out.println("Depositing money in HDFC bank");
    }
}

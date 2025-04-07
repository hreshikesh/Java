package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Bank;
import com.xworkz.isarelation.Internal.SavingsAccount;

public class Account {
    public void spend(Bank bank){
        bank.deposit();
        bank.withdraw();
        bank.checkBalance();
        bank.transferMoney();
        bank.provideLoan();
        if(bank instanceof SavingsAccount){
            System.out.println("in SavingsAccount");
            SavingsAccount savingsAccount=(SavingsAccount) bank;
            savingsAccount.create();
        }
    }

}

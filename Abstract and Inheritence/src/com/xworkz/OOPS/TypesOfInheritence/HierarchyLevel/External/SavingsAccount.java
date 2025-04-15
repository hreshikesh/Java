package com.xworkz.OOPS.TypesOfInheritence.HierarchyLevel.External;

import com.xworkz.OOPS.TypesOfInheritence.HierarchyLevel.Internal.Account;

public class SavingsAccount extends Account {
    @Override
    public void deposit()
    {
        System.out.println("Depositing in SavingsAccount");
    }

}

package com.xworkz.Interface.External.Implementation2;

import com.xworkz.Interface.Internal.Rules.BarberRule;
import com.xworkz.Interface.Internal.Rules.MinerRules;
import com.xworkz.Interface.Internal.Rules.SaloonRule;
import com.xworkz.Interface.Internal.Rules.SecurityRules;

public class Occupation implements BarberRule, MinerRules, SaloonRule, SecurityRules {

    @Override
    public void barberSafety() {
        System.out.println("Occupation barberSafety is important");

    }

    @Override
    public void barberTools() {
        System.out.println("Occupation barberTools is important");

    }

    @Override
    public void barberHygiene() {
        System.out.println("Occupation barberHygiene is important");

    }

    @Override
    public void dig() {
        System.out.println("Occupation dig is important");

    }

    @Override
    public void drill() {
        System.out.println("Occupation drill is important");

    }

    @Override
    public void blast() {
        System.out.println("Occupation blast is important");

    }

    @Override
    public void saloonServices() {
        System.out.println("Occupation saloonServices is important");

    }

    @Override
    public void saloonCustomerCare() {
        System.out.println("Occupation saloonCustomerCare is important");

    }

    @Override
    public void saloonHygiene() {
        System.out.println("Occupation saloonHygiene is important");

    }

    @Override
    public void lockDoors() {
        System.out.println("Occupation lockDoors is important");

    }

    @Override
    public void setAlarm() {
        System.out.println("Occupation setAlarm is important");

    }

    @Override
    public void checkWindows() {
        System.out.println("Occupation checkWindows is important");

    }
}

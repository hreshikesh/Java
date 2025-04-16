package com.xworkz.Interface.External.Implementation1;

import com.xworkz.Interface.Internal.Rules.Coding;
import com.xworkz.Interface.Internal.Rules.CompanyRule;

public class Developer implements CompanyRule, Coding {

    @Override
    public void writeCode() {
        System.out.println("Developer writeCode is important");
    }

    @Override
    public void debugCode() {
        System.out.println("Developer debugCode is important");

    }

    @Override
    public void testCode() {
        System.out.println("Developer testCode is important");

    }

    @Override
    public void companyWorkHours() {
        System.out.println("Developer companyWorkHours is important");

    }

    @Override
    public void companyLeavePolicy() {
        System.out.println("Developer companyLeavePolicy is important");

    }

    @Override
    public void companyInsurance() {
        System.out.println("Developer companyInsurance is important");

    }
}

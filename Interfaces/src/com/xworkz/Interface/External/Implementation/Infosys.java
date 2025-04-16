package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.CompanyRule;

public class Infosys implements CompanyRule {
    @Override
    public void companyWorkHours() {
        System.out.println("Infosys work hours are 9 AM to 5 PM");
    }

    @Override
    public void companyLeavePolicy() {
        System.out.println("Infosys leave policy allows 12 days of paid leave per year");
    }

    @Override
    public void companyInsurance() {
        System.out.println("Infosys provides health insurance for employees and their families");
    }
}

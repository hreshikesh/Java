package com.xworkz.Interface.Internal.Rules;

public interface CompanyRule {



    void companyWorkHours();

    void companyLeavePolicy();

    void companyInsurance();

    default void companyInfo() {
        System.out.println("Company information");
    }


}

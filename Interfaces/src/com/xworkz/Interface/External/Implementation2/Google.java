package com.xworkz.Interface.External.Implementation2;

import com.xworkz.Interface.Internal.Rules.*;

public class Google implements CleaningRules, CompanyRule, Coding, EmployeeRule, Laptop {
    @Override
    public void sweep() {
        System.out.println("Google sweep is important");
    }

    @Override
    public void mop() {
        System.out.println("Google mop is important");

    }

    @Override
    public void dust() {
        System.out.println("Google dust is important");

    }

    @Override
    public void writeCode() {
        System.out.println("Google writeCode is important");

    }

    @Override
    public void debugCode() {
        System.out.println("Google debugCode is important");

    }

    @Override
    public void testCode() {
        System.out.println("Google testCode is important");
    }

    @Override
    public void companyWorkHours() {
        System.out.println("Google companyWorkHours is important");

    }

    @Override
    public void companyLeavePolicy() {
        System.out.println("Google companyLeavePolicy is important");


    }

    @Override
    public void companyInsurance() {
        System.out.println("Google companyInsurance is important");

    }

    @Override
    public void employeeWorkHours() {
        System.out.println("Google employeeWorkHours is important");

    }

    @Override
    public void employeeLeavePolicy() {
        System.out.println("Google employeeLeavePolicy is important");

    }

    @Override
    public void employeeInsurance() {
        System.out.println("Google employeeInsurance is important");

    }

    @Override
    public void powerOn() {
        System.out.println("Google powerOn is important");

    }

    @Override
    public void runProgram() {
        System.out.println("Google runProgram is important");

    }

    @Override
    public void shutDown() {
        System.out.println("Google shutDown is important");

    }
}

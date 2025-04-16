package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.EmployeeRule;

public class Employee implements EmployeeRule {

    @Override
    public void employeeWorkHours() {
        System.out.println("Employee work hours are available");
    }

    @Override
    public void employeeLeavePolicy() {
        System.out.println("Employee leave policy is available");
    }

    @Override
    public void employeeInsurance() {
        System.out.println("Employee insurance is available");
    }
}

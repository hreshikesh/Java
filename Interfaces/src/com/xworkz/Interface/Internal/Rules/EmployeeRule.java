package com.xworkz.Interface.Internal.Rules;

public interface EmployeeRule {
    void employeeWorkHours();

    void employeeLeavePolicy();

    void employeeInsurance();

    default void employeeInfo() {
        System.out.println("Employee information");
    }


}

package com.xworkz.useInterface.impl;

import com.xworkz.useInterface.interfaces.HRPolicy;

public class EmployeeImpl implements HRPolicy {
    public void followRules() {
        System.out.println("EmployeeImpl is executing followRules.");
    }
}
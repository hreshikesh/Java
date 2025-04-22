package com.xworkz.useInterface.impl;

import com.xworkz.useInterface.interfaces.CustomerService;

public class WalmartImpl implements CustomerService {
    public void resolveComplaint() {
        System.out.println("WalmartImpl is executing resolveComplaint.");
    }
}
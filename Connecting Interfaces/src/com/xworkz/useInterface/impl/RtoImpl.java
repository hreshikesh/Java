package com.xworkz.useInterface.impl;

import com.xworkz.useInterface.interfaces.LicenseAuthority;

public class RtoImpl implements LicenseAuthority {
    public void issueLicense() {
        System.out.println("RtoImpl is executing issueLicense.");
    }
}
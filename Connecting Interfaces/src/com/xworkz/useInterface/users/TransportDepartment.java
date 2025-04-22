package com.xworkz.useInterface.users;

import com.xworkz.useInterface.interfaces.LicenseAuthority;

public class TransportDepartment {
    private LicenseAuthority obj;

    public TransportDepartment(LicenseAuthority obj) {

        this.obj = obj;
    }

    public void use()
    {
        if (obj != null) {
            obj.issueLicense();
        } else {
            System.err.println("LicenseAuthority is null");
        }
    }
}
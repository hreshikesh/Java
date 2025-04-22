package com.xworkz.useInterface.users;

import com.xworkz.useInterface.interfaces.CustomerService;

public class RetailChain {
    private CustomerService obj;

    public RetailChain(CustomerService obj) {

        this.obj = obj;
    }

    public void use() {
        if (obj != null) {
            obj.resolveComplaint();
        } else {
            System.err.println("LawSystem is null");
        }
    }
}
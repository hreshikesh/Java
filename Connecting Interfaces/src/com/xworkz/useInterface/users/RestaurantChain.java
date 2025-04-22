package com.xworkz.useInterface.users;

import com.xworkz.useInterface.interfaces.FranchiseAgreement;

public class RestaurantChain {
    private FranchiseAgreement obj;

    public RestaurantChain(FranchiseAgreement obj) {

        this.obj = obj;
    }

    public void use() {
        if (obj != null) {
            obj.followRecipe();
        } else {
            System.err.println("LawSystem is null");
        }
    }
}
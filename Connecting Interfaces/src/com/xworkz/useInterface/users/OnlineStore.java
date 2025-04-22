package com.xworkz.useInterface.users;

import  com.xworkz.useInterface.interfaces.InventorySystem;

public class OnlineStore {
    private InventorySystem obj;

    public OnlineStore(InventorySystem obj) {

        this.obj = obj;
    }

    public void use() {
        if (obj != null) {
            obj.updateStock();
        } else {
            System.err.println("LawSystem is null");
        }
    }
}
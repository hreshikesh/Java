package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.ShowRoomRule;

public class Showroom implements ShowRoomRule {
    @Override
    public void showRoomCustomerCare() {
        System.out.println("Showroom customer care is good");
    }

    @Override
    public void showRoomTools() {
        System.out.println("Showroom tools are available");
    }

    @Override
    public void showRoomProducts() {
        System.out.println("Showroom products are available");
    }
}

package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.SmartPhone;

public class Iphone implements SmartPhone {
    @Override
    public void makeCall() {
        System.out.println("Making a call from iPhone");
    }

    @Override
    public void sendMessage() {
        System.out.println("Sending a message from iPhone");

    }

    @Override
    public void browse() {
        System.out.println("Browsing the internet on iPhone");

    }
}

package com.xworkz.Interface.Internal.Rules;

public interface SmartPhone{
    void makeCall();
    void sendMessage();
    void browse();

    default void smartphoneInfo() {
        System.out.println("Smartphone information");
    }

}

package com.xworkz.Interface.Internal.Rules;

public interface Window {
    void open();
    void close();
    void slide();

    default void windowInfo() {
        System.out.println("Window information");
    }

}

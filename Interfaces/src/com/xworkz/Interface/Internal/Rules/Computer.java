package com.xworkz.Interface.Internal.Rules;

public interface Computer {


    void runProgram();

    void installSoftware();

    void uninstallSoftware();

    default void computerInfo() {
        System.out.println("Computer information");
    }
}

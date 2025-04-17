package com.xworkz.Interface.Internal.Rules;

public interface DebugRule {
    void debugErrorHandling();

    void debugLogging();


    void debugCodeReview();

    default void debugInfo() {
        System.out.println("Debugging information");
    }
}

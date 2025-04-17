package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.DebugRule;

public class Debug implements DebugRule {
    @Override
    public void debugErrorHandling() {
        System.out.println("Debug Error Handling");
    }

    @Override
    public void debugLogging() {
        System.out.println("Debug Logging");
    }

    @Override
    public void debugCodeReview() {
        System.out.println("Debug Code Review");
    }
    @Override
    public void debugInfo() {
        System.out.println("This is Debug, a process of identifying and removing errors from software.");
    }
}

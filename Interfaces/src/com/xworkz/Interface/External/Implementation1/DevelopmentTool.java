package com.xworkz.Interface.External.Implementation1;

import com.xworkz.Interface.Internal.Rules.Coding;
import com.xworkz.Interface.Internal.Rules.DebugRule;

public class DevelopmentTool implements Coding, DebugRule {

    @Override
    public void writeCode() {
        System.out.println("DevelopmentTool writeCode is important");
    }

    @Override
    public void debugCode() {
        System.out.println("DevelopmentTool debugCode is important");
    }

    @Override
    public void testCode() {
        System.out.println("DevelopmentTool testCode is important");
    }

    @Override
    public void debugErrorHandling() {
        System.out.println("DevelopmentTool debugErrorHandling is important");
    }

    @Override
    public void debugLogging() {
        System.out.println("DevelopmentTool debugLogging is important");
    }

    @Override
    public void debugCodeReview() {
        System.out.println("DevelopmentTool debugCodeReview is important");
    }
}

package com.xworkz.Interface.External.Implementation1;

import com.xworkz.Interface.Internal.Rules.Coding;
import com.xworkz.Interface.Internal.Rules.Laptop;

public class WebApp implements Laptop, Coding {
    @Override
    public void writeCode() {
        System.out.println("WebApp writeCode is important");
    }

    @Override
    public void debugCode() {
        System.out.println("WebApp debugCode is important");
    }

    @Override
    public void testCode() {
        System.out.println("WebApp testCode is important");
    }

    @Override
    public void powerOn() {
        System.out.println("WebApp powerOn is important");
    }

    @Override
    public void runProgram() {
        System.out.println("WebApp runProgram is important");
    }

    @Override
    public void shutDown() {
        System.out.println("WebApp shutDown is important");
    }
}

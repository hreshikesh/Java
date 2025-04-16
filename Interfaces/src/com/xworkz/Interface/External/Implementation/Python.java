package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.Coding;

public class Python implements Coding {
    @Override
    public void writeCode() {
        System.out.println("Writing Python code");
    }

    @Override
    public void debugCode() {
        System.out.println("Debugging Python code");
    }

    @Override
    public void testCode() {
        System.out.println("Testing Python code");
    }
}

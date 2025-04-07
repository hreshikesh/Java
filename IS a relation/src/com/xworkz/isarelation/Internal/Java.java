package com.xworkz.isarelation.Internal;

public class Java extends ProgrammingLanguage {
    public Java() {
        System.out.println("No arg const of Java");
    }

    @Override
    public void code() {
        System.out.println("Running code in subclass");
    }

    @Override
    public void error() {
        System.out.println("Running eror in subclass");
    }

    @Override
    public void compile() {
        System.out.println("Running compile in subclass");
    }

    @Override
    public void run() {
        System.out.println("Running run in subclass");
    }

    @Override
    public void debug() {
        System.out.println("Running debug in subclass");
    }

    public void implement(){
        System.out.println("Running implement in java");
    }
}

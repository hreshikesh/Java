package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.JavaRules;

public class Java implements JavaRules {
    @Override
    public void capital() {
        System.out.println("Java is a programming language");
    }

    @Override
    public void objectName() {
        System.out.println("Java is an object-oriented programming language");
    }

    @Override
    public void indentation() {
        System.out.println("Java uses indentation for code readability");
    }
}

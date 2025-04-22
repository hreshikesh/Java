package com.xworkz.useInterface.impl;;

import com.xworkz.useInterface.interfaces.Algorithm;

public class OpenAIModelImpl implements Algorithm {
    public void predict() {
        System.out.println("OpenAIModelImpl is executing predict.");
    }
}
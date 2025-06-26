package com.xworkz.rain;

import javax.sound.sampled.LineUnavailableException;

public class ExceptionRunner {

    public static void main(String[] args) throws LineUnavailableException {
        CreateException createException=new CreateException();
        createException.checkedException();
        createException.unCheckedException();
    }
}

package com.xworkz.isarelation.Internal;

public class Chrome extends Browser {
    public Chrome() {
        System.out.println("Running no-arg constructor of Chrome");
    }
    @Override
    public void open() {
        System.out.println("Browser can open websitesin subclass");
    }
    @Override
    public void close() {
        System.out.println("Browser can be closed in subclass");
    }
    @Override
    public void navigate() {
        System.out.println("Browser allows navigation between web pages in subclass");
    }
    @Override
    public void incognitoMode() {
        System.out.println("Browser supports private browsing mode in subclass");
    }
    @Override
    public void extensions() {
        System.out.println("Browser supports extensions and add-ons in subclass");
    }
}

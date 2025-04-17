package com.xworkz.Interface.Internal.Rules;

public interface Browser {
    void openBrowser();

    void closeBrowser();

    void refreshBrowser();

    default void browserInfo() {
        System.out.println("Browser information");
    }


}

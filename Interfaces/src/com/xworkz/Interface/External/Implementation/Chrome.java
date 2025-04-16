package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.Browser;

public class Chrome implements Browser {
    @Override
    public void openBrowser() {
        System.out.println("Opening Chrome Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Chrome Browser");
    }

    @Override
    public void refreshBrowser() {
        System.out.println("Refreshing Chrome Browser");
    }
}

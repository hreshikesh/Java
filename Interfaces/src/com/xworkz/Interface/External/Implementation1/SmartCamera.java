package com.xworkz.Interface.External.Implementation1;

import com.xworkz.Interface.Internal.Rules.Browser;
import com.xworkz.Interface.Internal.Rules.Camera;

public class SmartCamera implements Camera, Browser {
    @Override
    public void openBrowser() {
        System.out.println("Opening browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing browser");
    }

    @Override
    public void refreshBrowser() {
        System.out.println("Refreshing browser");
    }

    @Override
    public void takePhoto() {
        System.out.println("Taking photo");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording video");
    }

    @Override
    public void filter() {
        System.out.println("Applying filter");
    }
}

package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.Router;

public class WifiRouter implements Router {
    @Override
    public void connect() {
        System.out.println("Connecting to the WiFi router");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from the WiFi router");

    }

    @Override
    public void reset() {
        System.out.println("Resetting the WiFi router");

    }
}

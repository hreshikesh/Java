package com.xworkz.OOPS.TypesOfInheritence.SingleLevel.External;

import com.xworkz.OOPS.TypesOfInheritence.SingleLevel.Internal.Adapter;

public class WifiAdapter extends Adapter {
    @Override
    public void connect() {
        System.out.println("Running connect in Wifiadapter");
    }
}

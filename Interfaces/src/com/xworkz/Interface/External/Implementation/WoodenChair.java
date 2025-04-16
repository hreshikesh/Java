package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.Chair;

public class WoodenChair implements Chair {
    @Override
    public void sit() {
        System.out.println("Sitting on a wooden chair");
    }

    @Override
    public void stand() {
        System.out.println("Standing up from the wooden chair");
    }

    @Override
    public void recline() {
        System.out.println("Reclining the wooden chair");
    }
}

package   com.xworkz.useInterface.impl;

import com.xworkz.useInterface.interfaces.RoadRules;

public class TrafficWardenImpl implements RoadRules {
    public void enforceLaw() {
        System.out.println("TrafficWardenImpl is executing enforceLaw.");
    }
}
package com.xworkz.Interface.External.Implementation1;

import com.xworkz.Interface.Internal.Rules.Clock;
import com.xworkz.Interface.Internal.Rules.Coding;
import com.xworkz.Interface.Internal.Rules.Computer;

public class ProgrammerClock implements Clock, Coding {
    @Override
    public void showTime() {
        System.out.println("ProgrammerClock showTime is important");
    }

    @Override
    public void setAlarm() {
        System.out.println("ProgrammerClock setAlarm is important");

    }

    @Override
    public void tick() {
        System.out.println("ProgrammerClock tick is important");

    }

    @Override
    public void writeCode() {
        System.out.println("ProgrammerClock writeCode is important");

    }

    @Override
    public void debugCode() {
        System.out.println("ProgrammerClock debugCode is important");

    }

    @Override
    public void testCode() {
        System.out.println("ProgrammerClock testCode is important");

    }
}

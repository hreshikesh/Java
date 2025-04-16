package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.Computer;

public class Dell implements Computer {
    @Override
    public void runProgram() {
        System.out.println("Running program on Dell");
    }

    @Override
    public void installSoftware() {
        System.out.println("Installing software on Dell");
    }

    @Override
    public void uninstallSoftware() {
        System.out.println("Uninstalling software from Dell");
    }
}

package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.Window;

public class SlidingWindow implements  Window {

    @Override
    public void open() {
        System.out.println("Sliding window is opening");
    }

    @Override
    public void close() {
        System.out.println("Sliding window is closing");
    }

    @Override
    public void slide() {
        System.out.println("Sliding window is sliding");
    }
    @Override
    public void windowInfo() {
        System.out.println("This is a sliding window");
    }


}

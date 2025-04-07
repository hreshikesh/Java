package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Display;
import com.xworkz.isarelation.Internal.Monitor;

public class Advertise {
    public void showAd(Display display){
        display.showImage();
        display.resolution();
        display.refreshRate();
        display.brightness();
        display.displayType();
        if(display instanceof Monitor){
            System.out.println("In Monitor");
            Monitor monitor=(Monitor) display;
            monitor.refresh();
        }
    }
}

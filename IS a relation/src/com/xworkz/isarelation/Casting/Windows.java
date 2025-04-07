package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.OperatingSystem;
import com.xworkz.isarelation.Internal.Software;

public class Windows {
    public void boot(Software software){
        software.install();
        software.run();
        software.update();
        software.uninstall();
        software.configure();
        if(software instanceof OperatingSystem){
            System.out.println("In OperatingSystem");
            OperatingSystem operatingSystem=(OperatingSystem) software;
            operatingSystem.osVersion();
        }

    }
}

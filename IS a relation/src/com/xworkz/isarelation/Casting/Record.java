package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.OutputDevice;
import com.xworkz.isarelation.Internal.Printer;

public class Record {
    public void printRecord(OutputDevice outputDevice){
        outputDevice.output();
        outputDevice.print();
        outputDevice.connect();
        outputDevice.disconnect();
        outputDevice.produce();
        if(outputDevice instanceof Printer){
            System.out.println("In Printer");
            Printer printer=(Printer) outputDevice;
            printer.pinFiles();
        }
    }
}

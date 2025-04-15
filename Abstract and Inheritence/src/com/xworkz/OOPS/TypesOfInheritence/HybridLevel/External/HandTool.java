package com.xworkz.OOPS.TypesOfInheritence.HybridLevel.External;

import com.xworkz.OOPS.TypesOfInheritence.HybridLevel.Internal.Tool;

public class HandTool extends Tool {
    @Override
    public void useTool(){
        System.out.println("Use Hand Tool");
    }

    public void hold(){
        System.out.println("Hold handtool");
    }
}

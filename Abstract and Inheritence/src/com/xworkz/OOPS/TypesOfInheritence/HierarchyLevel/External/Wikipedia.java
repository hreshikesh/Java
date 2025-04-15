package com.xworkz.OOPS.TypesOfInheritence.HierarchyLevel.External;

import com.xworkz.OOPS.TypesOfInheritence.HierarchyLevel.Internal.Website;

public class Wikipedia extends Website {
    @Override
    public void browse() {
        System.out.println("Browsing Wikipedia Website");

    }
}

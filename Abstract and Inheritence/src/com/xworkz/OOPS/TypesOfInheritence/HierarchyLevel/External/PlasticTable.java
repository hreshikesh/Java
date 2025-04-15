package com.xworkz.OOPS.TypesOfInheritence.HierarchyLevel.External;

import com.xworkz.OOPS.TypesOfInheritence.HierarchyLevel.Internal.Table;

public class PlasticTable extends Table {
    @Override
    public void place(){
        System.out.println("Placing in plastic table");
    }
}

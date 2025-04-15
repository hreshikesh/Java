package com.xworkz.OOPS.TypesOfInheritence.HierarchyLevel.External;

import com.xworkz.OOPS.TypesOfInheritence.HierarchyLevel.Internal.Table;


public class WoodenTable extends Table {
    @Override
    public void place(){
        System.out.println("Placing in woodentable");
    }
}

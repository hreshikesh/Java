package com.xworkz.OOPS.TypesOfInheritence.MultiLevel.External;

import com.xworkz.OOPS.TypesOfInheritence.MultiLevel.Internal.Person;

public class Employee extends Person {
    @Override
    public void request() {
        System.out.println("Request Employee");
    }
    public void work(){
        System.out.println("Working Employee");
    }
}

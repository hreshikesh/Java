package com.xworkz.collection.List.addclearsize;

import java.util.Collection;
import java.util.ArrayList;

public class College {
    public static void main(String[] args) {
        Collection<String> colleges = new ArrayList<>();
        colleges.add("MIT");
        colleges.add("IIT");
        colleges.add("NIT");
        colleges.add("SDIT");
        colleges.add("RVCE");
        colleges.add("BMSCE");
        colleges.add("PES University");
        colleges.add("MS Ramaiah");
        colleges.add("Bangalore Institute of Technology");
        colleges.add("VTU");
        System.out.println("--Colleges--" + colleges);
        System.out.println("Colleges Size " + colleges.size());
        colleges.clear();
        System.out.println("After clear()");
        System.out.println("Colleges Size " + colleges.size());
        System.out.println("-------------------------------------------");
        colleges.add("Manipal University");
        colleges.add("Christ University");
        colleges.add("Jain University");
        colleges.add("DSU");
        colleges.add("ATTE");
        colleges.add("Sayadri");
        colleges.add("Canara");
        colleges.add("Acharya");
        colleges.add("BIts");
        colleges.add("PACE");
        System.out.println("--Colleges--" + colleges);

    }
}

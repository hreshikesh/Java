package com.xworkz.collection.Set.HashSet.Runner;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BottleRunner {

    public static void main(String[] args) {
        Set<String> bottleType=new HashSet<>();
        bottleType.add("bisleri");
        bottleType.add("aqua");
        bottleType.add("bindu");
        bottleType.add("siraj");
        bottleType.add("frooti");

        bottleType.forEach(e-> System.out.println("bottle name "+e));

    }
}

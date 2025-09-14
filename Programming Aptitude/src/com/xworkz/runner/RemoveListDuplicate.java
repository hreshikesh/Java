package com.xworkz.runner;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveListDuplicate {
    public static void main(String[] args) {
//        Take an array of integers.
//                Sort them in ascending order using streams.
//        Remove duplicates.
//        Print the sorted distinct list.

        int[] values={11,1,5,7,8,9,4,1,4,8};

        Set<Integer> sortedValue= Arrays.stream(values).boxed().sorted().collect(Collectors.toSet());

        sortedValue.forEach(s-> System.out.println(s));


    }
}

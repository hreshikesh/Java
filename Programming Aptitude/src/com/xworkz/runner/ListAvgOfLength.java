package com.xworkz.runner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListAvgOfLength {
    public static void main(String[] args) {
//        Take a list of words: ["apple", "banana", "kiwi", "orange", "mango"].
//        Find the length of each word.
//        Keep only lengths greater than 4.
//        Print average length.

        List<String> words = new ArrayList<>(Arrays.asList("apple", "banana", "kiwi", "orange", "mango"));
        List<Integer> lengths = new ArrayList<>();
        for (String word : words) {
            int len = word.length();
            if (len > 4) {
                lengths.add(len);
            }
        }


            double sum = 0;
            for (int len : lengths) {
                sum += len;

            double avg = sum / lengths.size();
            System.out.println("Average length: " + avg);

        }
    }
}

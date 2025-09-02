package com.xworkz.runner;

public class NoOfWordsInString {
    public static void main(String[] args) {
        String sentence="Hello Good Morning Vaibhav";
        int count=0;
        String[]  filteredSentence=sentence.split("\\s");

        for(String word:filteredSentence){
            System.out.println(word);
            count++;
        }
        System.out.println(count);

    }
}

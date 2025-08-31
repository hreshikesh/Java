package com.xworkz.runner;

public class SentenceReverse {
    public static void main(String[] args) {
        String sentence="THis is a bus running";
        String rev="";
        String[] filteredSentence=sentence.split("\\s");
        for (String word:filteredSentence){
            for (int i = word.length()-1; i >=0 ; i--) {
                char ch=word.charAt(i);
                rev=rev+ch;
            }
            rev=rev+" ";
        }
        System.out.println(rev);
    }
}

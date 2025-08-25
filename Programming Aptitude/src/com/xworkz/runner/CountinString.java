package com.xworkz.runner;

public class CountinString {
    public static void main(String[] args) {
        String sentence="Asus Laptop F15 2024";
        int vowelCount=0;
        int constantCount=0;
        int digitCount=0;
        int spaceCount=0;


        for(int i=0;i<sentence.length();i++){
            char ch=sentence.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowelCount++;
            }
           else if(ch>='0' && ch<='9'){
               digitCount++;
            } else if (ch==' ') {
               spaceCount++;

            }else {
               constantCount++;
            }
        }

        System.out.println("Vowel count "+vowelCount);
        System.out.println("Costant Count "+constantCount);
        System.out.println("space Count "+spaceCount);
        System.out.println("digit Count "+digitCount);

    }
}

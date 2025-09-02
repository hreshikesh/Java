package com.xworkz.runner;

public class PermutationOfString {
    public static void permuteString(String value,String result){
        if (value.length()==0){
            System.out.println(result);
        }else {
            for (int i = 0; i < value.length(); i++) {
                char ch = value.charAt(i);

                String remainingValues = value.substring(0, i) + value.substring(i + 1);

                permuteString(remainingValues, result + ch);

            }
        }

    }




    public static void main(String[] args) {
        String value="hello";
        permuteString(value,"");

    }
}

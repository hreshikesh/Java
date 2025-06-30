package com.xworkz.array;

public class ArrayRunner {
    public static void main(String[] args) {
        //array using literal
        String[] name = {"Rishi", "Rosha", "vaibhav"};

        //array with new
        //initalzed directly
        char[] intial = new char[]{'K', 'S', 'S'};
        //initialized using index
        int[] age = new int[3];
        age[0] = 20;
        age[1] = 21;
        age[2] = 22;

        //reading array elemnts
        for (int i = 0; i < name.length; i++) {
            System.out.println(i + ".Names " + name[i]);
        }
        for (int i = 0; i < intial.length; i++) {
            System.out.println(i + ".initials " + intial[i]);
        }
        for (int i = 0; i < age.length; i++) {
            System.out.println(i + "Age " + age[i]);
        }
        //updating value of array
        // name[1] = "Roshan";
        for (int i = 0; i < name.length; i++) {
            name[1] = "Roshan";
            System.out.println(i + ".Names " + name[i]);
        }



    }
}

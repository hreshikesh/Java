package com.xworkz.runner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        int[] numbers={20,3,4,5,6};
        int totalNumber=numbers.length;
        int sum=0;
        double average;
        for(int number:numbers){
            sum+=number;
        }
        average= (double) sum /totalNumber;
        System.out.println(average);
    }
}
